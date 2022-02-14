public class deleteDuplicates {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null) return head;
            if(head.next == null) return head;
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode p = dummy;

            while(p.next != null)
            {
                ListNode q = p.next;
                while(q!=null && p.next.val == q.val) q = q.next;
                if(p.next.next == q) p = p.next;
                else p.next = q;

            }
            return dummy.next;
        }
        public static void main(String args[])
        {}

    }


}
