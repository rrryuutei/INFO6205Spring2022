public class longestUnivaluePath {
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        int val = root.val;
        int res = 0;
        if (root.left != null && root.left.val == val) {
            res = 1 + dfs(root.left);
        }
        if (root.right != null && root.right.val == val) {
            res += 1 + dfs(root.right);
        }
        return Math.max(res, Math.max(longestUnivaluePath(root.left), longestUnivaluePath(root.right)));
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        int val = root.val;

        if (root.left != null && root.left.val == val) {
            res = 1 + dfs(root.left);
        }

        if (root.right != null && root.right.val == val) {
            res = Math.max(res, 1 + dfs(root.right));
        }
        return res;
    }
    }
}
