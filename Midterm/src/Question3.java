import javax.swing.tree.TreeNode;

public class Question3 {
    class solution{
    public TreeNode bulidTree(int[] preoder, int[] inoder){
        if(preorder.length == 0||inorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i =0;i<preorder.length;i++){
            if (preorder[0]== inoder[i]){
                root.left = bulidTree(arrays.popofrange(preorder,1,i+1),arrays.popofrange(inorder,0,i));
                root.right = bulidTree(arrays.popofrange(preorder,i+1,preorder.length),arrays.popofrange(inorder,i+1,inorder.length));
                break;

            }
        }
        return root;
    }
}
}
