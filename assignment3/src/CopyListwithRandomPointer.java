import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class node {
    int val;
    node next;
    node random;

    public node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    Map<node, node> cachedNode = new HashMap<node, node>();

    public node copyRandomList(node head) {
        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            node headNew = new node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }
}
public class CopyListwithRandomPointer{
    public static void main(String args[])
    {
        Solution qs=new Solution();

    }
}