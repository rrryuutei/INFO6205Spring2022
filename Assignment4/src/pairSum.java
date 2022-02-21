import java.util.ArrayList;
import java.util.List;

public class pairSum {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int x)
        {
            val=x;
        }
    };
    class Solution
    {
        public int pairSum(ListNode head)
        {
            List<Integer> nums = new ArrayList<>();
            ListNode p = head;
            while (p != null)
            {
                nums.add(p.val);
                p = p.next;
            }

            int n = nums.size();
            int res = Integer.MIN_VALUE;
            for (int i = 0; i < n / 2; i ++)
            {
                int a = nums.get(i);
                int b = nums.get(n - 1 - i);
                res = Math.max(res, a + b);
            }

            return res;
        }
    }


}
