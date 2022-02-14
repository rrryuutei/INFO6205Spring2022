import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class nextLargerNodes {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public class Solution {
        public int[] nextLargerNodes(ListNode head) {
            List<Integer> res = new ArrayList<>();
            while (head != null ) {
                res.add(head.val);
                head = head.next;
            }
            Stack<Integer> stack = new Stack<>();
            for (int i = res.size() - 1; i >= 0; i --) {
                int x = res.get(i);
                while (stack.size() > 0 && x >= stack.peek()) {
                    stack.pop();
                }
                if (stack.size() > 0) {
                    res.set(i, stack.peek());
                } else {
                    res.set(i, 0);
                }
                stack.push(x);
            }
            int[] ans = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                ans[i] = res.get(i);
            }
            return ans;
        }
        public static void main(String args[])
        {}

    }

}
