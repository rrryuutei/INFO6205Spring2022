import java.util.ArrayList;

public class InsertInterval {
    class Solution {
        private boolean check(int l,int r,int a,int b)//判断ab和lr是否相交
        {
            if(l>b) return false;
            if(a>r) return false;
            return true;
        }
        public int[][] insert(int[][] intervals, int[] newInterval) {
            ArrayList<int[]> arr=new ArrayList<>();
            int l=newInterval[0];
            int r=newInterval[1];
            boolean flag=true;
            for(int i=0;i<intervals.length;i++)
            {
                if(flag && r<intervals[i][0]) { //flag==true代表l，r是否在答案数组里面 如果他在当前线段前面 把他放进去
                    flag = false;// 同时更新flag
                    arr.add(new int[]{l, r});
                }

                if(check(intervals[i][0],intervals[i][1],l,r))
                {
                    //说明l,r要放到答案数组里
                    flag=false;
                    int j=i;
                    int minv=l;
                    int maxv=r;
                    //这里是双指针 找到 l,r重叠的最大范围 即 [i,j-1]
                    while(j<intervals.length && check(intervals[j][0],intervals[j][1],l,r))
                    {
                        minv=Math.min(intervals[j][0],minv);
                        maxv=Math.max(intervals[j][1],maxv);
                        j++;
                    }
                    arr.add(new int[]{minv,maxv});
                    i=j-1;
                }
                else
                {
                    arr.add(intervals[i]);
                }
            }
            if(flag )
            {
                arr.add(new int[]{l,r});
            }
            int[][] res=new int[arr.size()][2];
            for(int i=0;i<res.length;i++)
            {
                res[i]=arr.get(i);
            }
            return res;
        }
    }

}
