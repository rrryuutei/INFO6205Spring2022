import java.util.HashMap;

public class numComponents {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int x)
        {
            val=x;
        }
    };
    class Solution {
        public int numComponents(ListNode head, int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>(nums.length*2);
            for (int item : nums) {
                map.put(item, 1);
            }
            int res = 0;

            while (head != null) {
                if (map.get(head.val) != null)
                {
                    while (head != null && map.get(head.val) != null)
                    {
                        head = head.next;
                    }
                    res++;
                } else {
                    head = head.next;
                }
            }

            return res;
        }
    }



}
