public class partition {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int x)
        {
            val=x;
        }
    }
    class Solution {
        public ListNode partition(ListNode head, int x) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode left = new ListNode(-1), right = new ListNode(-1);
            ListNode lTail = left, rTail = right;

            for (ListNode p = head; p != null; p = p.next) {
                if (p.val < x) {
                    lTail.next = p;
                    lTail = lTail.next;
                } else {
                    rTail.next = p;
                    rTail = rTail.next;
                }
            }
            lTail.next = right.next;
            rTail.next = null;
            return left.next;
        }
    }

}
