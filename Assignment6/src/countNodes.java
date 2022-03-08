import javax.swing.tree.TreeNode;

public class countNodes {
    class Solution {
        public int countNodes(TreeNode root) {
            if (root == null) return 0;
            int x = 1, y = 1;
            TreeNode l = root, r = root;
            while (l.left != null) {
                x ++;
                l = l.left;
            }
            while (r.right != null) {
                y ++;
                r = r.right;
            }
            if (x == y) return (1 << x) - 1;
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
}
