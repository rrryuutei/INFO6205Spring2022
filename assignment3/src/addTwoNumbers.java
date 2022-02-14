public class addTwoNumbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
  class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0); // 定义一个虚拟头结点
            ListNode cur = dummy; // cur指向dummy指向的节点
            int t = 0; // 用t存储和
            while(l1 != null|| l2 != null || t != 0){
                if(l1 != null){
                    t += l1.val;
                    l1 = l1.next;
                }
                if(l2 != null){
                    t += l2.val;
                    l2 = l2.next;
                }
                cur.next = new ListNode(t % 10);
                cur = cur.next;
                t /= 10;
            }
            return dummy.next; // 注意此处返回的是dummy.next
        }

    }


}
