import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class findLeaves {

    class Solution{
        public List<List<Integer>> findLeaves(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            int count = 0;
            while(root.left != null || root.right != null) {
                result.add(new ArrayList<>());
                traverse(root, result.get(count));
                count++;
            }
            result.add(new ArrayList<>(){{add(root.val);}});
            return result;
        }

        private void traverse(TreeNode root, List<Integer> current) {
            if(root == null) {
                return;
            }
            if(isLeaf(root.left)) {
                current.add(root.left.val);
                root.left = null;
            }
            if(isLeaf(root.right)) {
                current.add(root.right.val);
                root.right = null;
            }
            traverse(root.left, current);
            traverse(root.right, current);
        }

        private boolean isLeaf(TreeNode root) {
            if(root == null) {
                return false;
            }
            return root.left == null && root.right == null;
        }
    }
}
