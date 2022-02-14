public class removeNthFromEnd {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode quick = head,slow = head;
            for(int i = 0;i<n;i++){
                quick = quick.next;
            }
            while(quick != null && quick.next != null){
                quick = quick.next;
                slow = slow.next;
            }
            if(quick == null) return slow.next;
            if(slow != null && slow.next != null)
                slow.next = slow.next.next;
            return head;
        }

      //  public static void main(String args[])
        {}

    }

}
