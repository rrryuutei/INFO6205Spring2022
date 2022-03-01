import javax.swing.tree.TreeNode;
import java.util.*;

public class largestValues {
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
        public List<Integer> largestValues(TreeNode root) {
            Queue<TreeNode> q= new LinkedList<>();
            HashMap<TreeNode,Integer> mp=new HashMap<TreeNode, Integer>();
            mp.put(root,0);
            int res[]=new int[10010];
            for(int i=0;i<10010;i++)
                res[i]=Integer.MIN_VALUE;
            // System.out.println("qwq");
            if(root == null)
            {
                return new ArrayList();
            }
            res[0]=root.val;
            q.add(root);
            List<Integer>ans =new ArrayList();

            int maxdep = 0;
            while(q.size() > 0)
            {
                TreeNode tt = q.poll();
                maxdep = Math.max(maxdep,mp.get(tt));
                if(tt.left != null)
                {
                    mp.put(tt.left,mp.get(tt) + 1);
                    res[mp.get(tt) +1 ]= Math.max(res[mp.get(tt)+1],tt.left.val);
                    q.add(tt.left);
                }
                if(tt.right != null)
                {
                    mp.put(tt.right,mp.get(tt) + 1 );
                    q.add(tt.right);
                    res[mp.get(tt) +1 ]= Math.max(res[mp.get(tt)+1],tt.right.val);
                }
            }
            for(int i=0;i<=maxdep;i++)
                ans.add(res[i]);
            return ans;
        }
    }

}
