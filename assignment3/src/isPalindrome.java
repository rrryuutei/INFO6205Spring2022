public class isPalindrome {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode slow= head, fast = head;
            ListNode pre = null;
            while (fast != null && fast.next != null){
                fast = fast.next.next;
                ListNode next = slow.next;
                slow.next = pre;
                pre = slow;
                slow = next;
            }
            if (fast != null) slow= slow.next;
            while (slow != null){
                if (slow.val != pre.val) return false;
                slow = slow.next;
                pre = pre.next;
            }
            return true;
        }
        //public static void main(String args[])
        {}

    }

}
