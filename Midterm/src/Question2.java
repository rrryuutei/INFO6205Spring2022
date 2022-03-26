public class Question2 {
    class solution{
    public ListNode addTwoNumbers(ListNode L1,ListNode L2){
        ListNode L3 = new ListNode(0);
        ListNode head = L3;
        int sum = 0;
        while(L1 != null||L2 != null){
            sum = sum > 9 ? 1:0 ;
            if (L1 !=null){
                sum += L1.val;
                L1=L1.next;
            }
            if(L2 != null){
                sum +=L2.val;
                L2=L2.next;
            }
            L3.next= new ListNode(sum%10);
            L3= L3.next;
        }
     if(sum>9){
         L3.next = new ListNode(1);

     }
     return head.next;
    }
    }
}
