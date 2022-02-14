import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class mergeKLists {


    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            //重写compare
            Queue<ListNode> q = new PriorityQueue<>(
                    new Comparator<ListNode>(){
                        @Override
                        public int compare(ListNode o1, ListNode o2){
                            return o1.val - o2.val;
                        }
                    }
            );
            for(ListNode node:lists){
                if(node!=null){
                    q.offer(node);
                }
            }
            ListNode dummy =  new ListNode(-1);
            ListNode tail = dummy;
            while(!q.isEmpty()){
                ListNode minNode = q.poll();
                tail.next = minNode;
                tail = minNode;
                if(minNode.next!=null){
                    q.offer(minNode.next);
                }
            }
            return dummy.next;
        }
       // public static void main(String args[])
        {}

    }


}
