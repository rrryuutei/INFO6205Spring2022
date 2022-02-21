public class mergeInBetween {
    class ListNode{
        ListNode next;
        int val;
    }
    class solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {        ListNode leftSide = list1;
            ListNode rightSide = list1;
            int leftCount = 1;
            int rightCount = 0;

            //leftSide 移动到a的前一位, a-1的位置
            while(leftCount < a){
                leftSide = leftSide.next; //移动到 a的前面一位
                leftCount++;
            }


            while(rightCount <= (leftCount + b - a)){ //移动到b的后一位
                rightSide = rightSide.next;
                rightCount++;
            }
            //遍历查找list2的末尾
            ListNode temp = list2;

            // list2 为链表2的首元结点, temp为末尾结点
            while(temp.next != null){
                temp = temp.next;
            }

            //重新指定位置
            leftSide.next = list2;
            temp.next = rightSide;

            return list1;
        }
    }

}
