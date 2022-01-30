import java.util.ArrayList;

public class IntervalListIntersections {
    class Solution {
        public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
            ArrayList<int[]> ans=new ArrayList<>();
            int i=0;
            int j=0;
            int n=firstList.length;
            int m=secondList.length;
            while(i<n && j<m)
            {
                int L=Math.max(firstList[i][0],secondList[j][0]);
                int R=Math.min(firstList[i][1],secondList[j][1]);
                if(L<=R)
                    ans.add(new int[]{L,R}); //如果两个线段相交
                if(firstList[i][1]<secondList[j][1])    i++; //如果firstlist的线段更靠前
                else    j++;
            }
            return ans.toArray(new int[ans.size()][]);
        }
    }

}
