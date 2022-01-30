import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class TopKFrequentElements {

    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int x:nums)
                mp.put(x,mp.get(x)==null?1:mp.get(x)+1); //用hashmap记录每个数出现的次数
            ArrayList<Integer> arr=new ArrayList<>();
            for(int x:nums)
            {
                if(arr.contains(x) == false) //arr里面只记录不存在的元素
                    arr.add(x);
            }
            Collections.sort(arr, new Comparator<Integer>() {//按照出现次数排序
                @Override
                public int compare(Integer o1, Integer o2) {
                    return mp.get(o2)-mp.get(o1);
                }
            });
            int res[]=new int[k];
            for(int i=0;i<k;i++)
                res[i]=arr.get(i);
            return res;
        }
    }


}
