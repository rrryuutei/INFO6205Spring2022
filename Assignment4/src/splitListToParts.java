public class splitListToParts {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int x)
        {
            val=x;
        }
    }
    class Solution {
        public ListNode[] splitListToParts(ListNode head, int k) {
            int cnt = 0;
            ListNode cur = head;
            while (cur != null) {
                cur = cur.next;
                cnt++;
            }
            int per = cnt / k;
            int surplus = cnt % k;
            ListNode[] ans = new ListNode[k];
            cur = head;
            for (int i = 0; i < k; i++) {
                ans[i] = cur;
                for (int j = 0; j < per + (surplus > 0 ? 1 : 0) - 1; j++) {
                    cur = cur.next;
                }
                surplus--;
                if (cur == null) break;
                ListNode next = cur.next;
                cur.next = null;
                cur = next;
            }
            return ans;
        }
    }


}
