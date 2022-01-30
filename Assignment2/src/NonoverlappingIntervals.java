import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NonoverlappingIntervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            ArrayList<int[]> arr=new ArrayList<>();
//贪心 按照右端点排序，右端点小的在前面
            for(int []x:intervals)
            {
                arr.add(x);
            }
            Collections.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[1]!=o2[1])
                        return o1[1]-o2[1];
                    return o1[0]-o2[0];
                }
            });
            int l=arr.get(0)[0];
            int r=arr.get(0)[1];
            int res=0;
            for(int i=1;i<arr.size();i++)
            {
                int x=arr.get(i)[0];
                int y=arr.get(i)[1];
                if(x<r)
                {
                    res++;
                    continue;
                }
                else{
                    r=y;
                }
            }
            return res;
        }
    }




}
