public class lowestCommonAncestor {
   
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val == p.val || root.val == q.val) {
                return root;
        }
        if((isz(root.left, p) &&isz(root.left, q))) { 
            return lowestCommonAncestor(root.left, p, q);
        }
        if((isz(root.right,p) &&isz(root.right,q))) {
                return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
    public boolean isz(TreeNode root,TreeNode p){ 
        if(root == null){ 
                return false;
        }
        if(root.val == p.val){
                return true;
        }
        return isz(root.left, p) || isz(root.right, p);
    }
}
}
