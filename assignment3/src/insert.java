public class insert {
    class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }
    class Solution {
        public Node insert(Node node, int x) {
            // write your code here
            Node root = new Node(x);
            if (node == null) {
                root.next = root;
                return root;
            }
            Node curr = node;
            Node post = node.next;
            while (post != node) {
                if (x >= curr.val && x <= post.val) {
                    break;
                }
                if ((post.val < curr.val) && (x > curr.val || x < post.val)) {
                    break;
                }
                post = post.next;
                curr = curr.next;
            }
            curr.next = root;
            root.next = post;
            return node;
        }
       // public static void main(String args[])
        {
//

        }

    }

}
