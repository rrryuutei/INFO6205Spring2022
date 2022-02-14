
public class reorderList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public void reorderList(ListNode head) {
            if (head == null || head.next == null) return;
            // 把链表从中间分成两部分
            ListNode fast = head.next.next, slow = head.next;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode head2 = slow.next;
            slow.next = null;
            // 逆序后半部分链表
            head2 = reverseList(head2);
            // 将两链表重新拼接
            ListNode dummy = new ListNode(-1), tail = dummy;
            while (head != null || head2 != null) {
                if (head != null) {
                    tail.next = head;
                    tail = head;
                    head = head.next;
                }
                if (head2 != null) {
                    tail.next = head2;
                    tail = head2;
                    head2 = head2.next;
                }
            }
        }
        private ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode succ = head.next;
            ListNode newHead = reverseList(succ);
            succ.next = head;
            head.next = null;
            return newHead;
        }
        public static void main(String args[])
        {}

    }


}
