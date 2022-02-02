import java.util.*;

public class TopKFrequentWords {
   class Solution {
    class node
    {
        String val;
        int cnt;
        node(String val,int cnt)
        {
            this.val=val;
            this.cnt=cnt;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<node>q=new PriorityQueue<>(new Comparator<node>() {
            @Override
            public int compare(node o1, node o2) {
                if(o1.cnt!=o2.cnt)
                    return o2.cnt-o1.cnt;
                return o1.val.compareTo(o2.val);
            }
        });
        HashMap<String,Integer>mp=new HashMap<>();
        for(String val:words)
        {
            mp.put(val,mp.get(val)==null?1:mp.get(val)+1);
        }
        for(String s:mp.keySet())
        {
            q.offer(new node(s,mp.get(s)));
        }
        List<String>res=new ArrayList<>();
        for(int i = 0; i < k; k--)
        {
            node tt=q.poll();
            res.add(tt.val); 
        }
        return res;
    }
}


}
