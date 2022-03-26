import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class verticalTraversal {
    class Solution {
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            ArrayList<int[]> ans = new ArrayList<>();
            List<List<Integer>> ansFinal = new ArrayList<>();
            traverse(root, ans, 0, 0);
            ans.sort((o1, o2) -> {
                if (Integer.compare(o1[0], o2[0]) == 0) {
                    if (Integer.compare(o2[1], o1[1]) == 0) {
                        return Integer.compare(o1[2], o2[2]);
                    }
                    return Integer.compare(o2[1], o1[1]);
                } else {

                    return Integer.compare(o1[0], o2[0]);
                }
            });

            for (int i = 0; i < ans.size(); i++) {
                int[] arr = ans.get(i);
                List<Integer> ansInt = null;
                if (i == 0) {
                    ansInt = new ArrayList<Integer>();
                    ansInt.add(arr[2]);
                    ansFinal.add(ansInt);
                } else {
                    if (arr[0] == ans.get(i - 1)[0]) {
                        ansFinal.get(ansFinal.size() - 1).add(arr[2]);
                    } else {
                        ansInt = new ArrayList<Integer>();
                        ansInt.add(arr[2]);
                        ansFinal.add(ansInt);
                    }
                }

            }

            return ansFinal;
        }

        public  void traverse(TreeNode root, ArrayList<int[]> ans, int x, int y) {
            if (root != null) {
                int[] data = new int[3];
                data[0] = x;
                data[1] = y;
                data[2] = root.val;
                ans.add(data);
                if (root.left != null) {
                    traverse(root.left, ans, x - 1, y - 1);
                }
                if (root.right != null) {
                    traverse(root.right, ans, x + 1, y - 1);
                }
            }
        }
    }


}
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        ArrayList<int[]> ans = new ArrayList<>();
        List<List<Integer>> ansFinal = new ArrayList<>();
        traverse(root, ans, 0, 0);
        ans.sort((o1, o2) -> {
            if (Integer.compare(o1[0], o2[0]) == 0) {
                if (Integer.compare(o2[1], o1[1]) == 0) {
                    return Integer.compare(o1[2], o2[2]);
                }
                return Integer.compare(o2[1], o1[1]);
            } else {

                return Integer.compare(o1[0], o2[0]);
            }
        });

        for (int i = 0; i < ans.size(); i++) {
            int[] arr = ans.get(i);
            List<Integer> ansInt = null;
            if (i == 0) {
                ansInt = new ArrayList<Integer>();
                ansInt.add(arr[2]);
                ansFinal.add(ansInt);
            } else {
                if (arr[0] == ans.get(i - 1)[0]) {
                    ansFinal.get(ansFinal.size() - 1).add(arr[2]);
                } else {
                    ansInt = new ArrayList<Integer>();
                    ansInt.add(arr[2]);
                    ansFinal.add(ansInt);
                }
            }

        }

        return ansFinal;
    }

    public  void traverse(TreeNode root, ArrayList<int[]> ans, int x, int y) {
        if (root != null) {
            int[] data = new int[3];
            data[0] = x;
            data[1] = y;
            data[2] = root.val;
            ans.add(data);
            if (root.left != null) {
                traverse(root.left, ans, x - 1, y - 1);
            }
            if (root.right != null) {
                traverse(root.right, ans, x + 1, y - 1);
            }
        }
    }
}
