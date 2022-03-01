import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class widthOfBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        static HashMap<Integer,Integer> mp;
        static int res;
        static void dfs(TreeNode root , int u, int dep)
        {
            if(mp.get(dep)==null)
            {
                mp.put(dep,u);
            }
            else
            {
                res = Math.max(res , u - mp.get(dep) + 1);
            }
            if (root.left != null)
                dfs(root.left,u*2,dep+1);
            if( root.right != null)
                dfs(root.right,u*2+1,dep+1);

        }
        public int widthOfBinaryTree(TreeNode root) {
            if(root == null)
                return 0;
            res=1;
            mp=new HashMap<>();
            dfs(root,1,1);
            return res;
        }
    }

}
