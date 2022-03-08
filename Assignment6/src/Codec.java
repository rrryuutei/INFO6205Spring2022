import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    public String serialize(TreeNode root) {
        // 如果传入的树为空数，就返回一个n@ ，其中n代表这个节点是空节点，@是分隔符，可以替换成别的，如#和,
        if(root == null){
            return "n@";
        }

        Queue<TreeNode> queue = new LinkedList<>();
        // 最后的结果，之所以用StringBuffer类，是为了便于增加
        StringBuffer string = new StringBuffer();
        TreeNode tree_null = new TreeNode (54545);
        // 队列加入初始节点
        queue.add(root);
        // 这个temp变量临时使用
        TreeNode temp;

        while (!queue.isEmpty()){
            // 取出队列第一个元素
            temp = queue.remove();

            if(temp == tree_null){
                // 说明指向的节点其实应该是null
                string.append("n");
                string.append('@');
                continue;
            }

            string.append(temp.val);
            string.append('@');
            // 左子树
            if(temp.left != null){
                queue.add(temp.left);
            }else {
                queue.add(tree_null);
            }
            // 右子树
            if(temp.right != null){
                queue.add(temp.right);
            }else {
                queue.add(tree_null);
            }
        }
        return string.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String regex = "@";
        String[] strs = data.split(regex);
        if(strs[0].equals("n")){
            // 第一个一定是一个数字，如果不是，就说明其实是一个空树
            return null;
        }

        TreeNode ans = new TreeNode (Integer.valueOf(strs[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        int index = 1;

        TreeNode temp = ans;
        queue.add(temp);

        while (!queue.isEmpty()){
            temp = queue.remove();
            if(!strs[index].equals("n")){
                // 如果不是n，就说明这个是一个正常的节点，生成该节点后，将其加入队列
                // 对于空节点，就不会加入队列
                temp.left = new TreeNode(Integer.valueOf(strs[index]));
                queue.add(temp.left);
            }

            index++;
            if(!strs[index].equals("n")){
                temp.right = new TreeNode(Integer.valueOf(strs[index]));
                queue.add(temp.right);
            }
            index++;
        }
        return ans;
    }
}