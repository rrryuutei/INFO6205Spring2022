import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class widthOfBinaryTree {
 
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
