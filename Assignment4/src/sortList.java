import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortList {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int x)
        {
            val=x;
        }
    }
    class Solution {
        public ListNode sortList(ListNode head) {
            List<Integer> tt=new ArrayList();
            while(head!=null)
            {
                tt.add(head.val);
                head=head.next;
            }
            Collections.sort(tt);
            ListNode nhead= new ListNode(0);
            ListNode np=nhead;
            for(int i=0;i<tt.size();i++)
            {
                np.next=new ListNode(tt.get(i));
                np=np.next;

            }
            return nhead.next;
        }
    }


}
