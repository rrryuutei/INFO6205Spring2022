import javax.swing.tree.TreeNode;
import java.util.*;

public class levelOrderBottom {

    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode> q=new LinkedList<>();
            List<List<Integer>>res=new ArrayList<>();
            if(root==null)
                return res;
            HashMap<Integer,List<Integer>> getans=new HashMap<>();
            HashMap<TreeNode,Integer>mp=new HashMap<>();
            mp.put(root, 0);
            q.add(root);
            while(q.size()>0)
            {
                TreeNode tt=q.poll();
                int dep=mp.get(tt);
                if(getans.get(dep) ==null)
                {
                    List<Integer>haha=new ArrayList();
                    haha.add(tt.val);
                    getans.put(dep,haha);
                }
                else
                {
                    List<Integer>qq=getans.get(dep);
                    qq.add(tt.val);
                    getans.put(dep,qq);
                }
                if(tt.left!=null)
                {
                    q.add(tt.left);
                    mp.put(tt.left,mp.get(tt)+1);
                }
                if(tt.right!=null)
                {
                    q.add(tt.right);
                    mp.put(tt.right,mp.get(tt)+1);
                }
            }
            int maxlen=0;
            for(int i=0;;i++)
            {
                if(getans.get(i)==null)
                    break;
                maxlen=i;

            }
            for(int i=maxlen;i>=0;i--)
            {
                res.add(getans.get(i));
            }
            return res;

        }
    }
}
