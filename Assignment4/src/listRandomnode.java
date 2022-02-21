import java.util.Random;

public class listRandomnode {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int x)
        {
            val=x;
        }
    }
    class Solution {
        public int size=0;
        public int[] nums;
        public Solution(ListNode head) {
            ListNode dummy=head;
            while(dummy!=null)
            {
                size++;//第一次遍历得到数组长度
                dummy=dummy.next;
            }
            nums=new int[size];
            for(int i=0;i<size;i++)
            {
                nums[i]=head.val;//第二次遍历将val记录到数组中
                head=head.next;
            }

        }

        public int getRandom() {
            Random r=new Random();
            int rd=r.nextInt(size);//使用Random类产生随机数
            return nums[rd];
        }
    }

}
