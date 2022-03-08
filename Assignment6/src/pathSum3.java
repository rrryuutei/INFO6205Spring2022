import javax.swing.tree.TreeNode;

public class pathSum3 {
    class Solution {
        public int pathSum(TreeNode root, int sum) {
// use dfs
            if (root == null){
                return 0;
            }
            return dfs(root, sum, 0) + pathSum(root.left, sum) + pathSum(root.right, sum);
        }
        private int dfs(final TreeNode current, final int sum, final int preSum){
            if(current == null){
                return 0;
            }
            final int currentSum = preSum + current.val;
            return (currentSum == sum ? 1 : 0)+
                    dfs(current.left, sum, currentSum) + dfs(current.right, sum, currentSum);

        }
    }
}
