public class oddEvenList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
   class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }


            ListNode oh = new ListNode(-1), ot = oh;
            ListNode eh = new ListNode(-1), et = eh;

            boolean odd = true;
            while (head != null) {
                if (odd) {
                    ot.next = head;
                    ot = ot.next;
                }else {
                    et.next = head;
                    et = et.next;
                }
                head = head.next;
                odd = !odd;
            }

            ot.next = eh.next;
            et.next = null;
            return oh.next;
        }

       // public static void main(String args[])
        {}

    }

}
