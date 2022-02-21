import java.util.ArrayList;
import java.util.List;

public class reverseEvenLengthGroups {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int x)
        {
            val=x;
        }
    }
    class Solution {
        public ListNode reverseEvenLengthGroups(ListNode head) {
            ListNode key=head;
            ListNode ans=key;
            List<Integer> list=new ArrayList<>();
            while(head!=null) {
                list.add(head.val);
                head = head.next;
            }
            int left=1,rigth=0,flag=1;
            while(rigth!=list.size()-1){
                rigth=Math.min(list.size()-1,left+flag);
                if((rigth-left)%2==1)
                    reverse(left,rigth, (ArrayList<Integer>) list);
                left=rigth+1;
                flag++;
            }
            for(int i=0;i<list.size();i++){
                ans.val=list.get(i);
                ans=ans.next;
            }
            return key;


        }
        public  void reverse(int i, int j, ArrayList<Integer> list) {
            while (i < j) {
                int temp = list.get(i);
                list.set(i++, list.get(j));
                list.set(j--, temp);
            }
        }
    }

}
