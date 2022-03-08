import javax.swing.tree.TreeNode;

public class sumNumbers {
    class Solution {
    public int sumNumbers(TreeNode root) {
        int[] sum = new int[1];
        buildNumbers(root, sum, 0);
        return sum[0];
    }
    public void buildNumbers(TreeNode root, int[] num, int currSum) {
        if (root.left == null && root.right == null) {
            num[0] += currSum + root.val;
        }
        if (root.left != null) {
            buildNumbers(root.left, num, (currSum + root.val) * 10);
        }
        if (root.right != null) {
            buildNumbers(root.right, num, (currSum + root.val) * 10);
        }
    }

}
}
