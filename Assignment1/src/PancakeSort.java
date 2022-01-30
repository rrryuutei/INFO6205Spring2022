import java.util.ArrayList;
import java.util.List;

public class PancakeSort {
    class Solution {
        public List<Integer> pancakeSort(int[] arr) {
            List<Integer>res=new ArrayList<>();
            int n=arr.length;
            for(int i=0;i<n;i++)
            {
                int maxv=0;
                int pos=0;
                for(int j=0;j<n-i;j++)
                {
                    if(arr[j]>maxv)
                    {
                        maxv=arr[j];
                        pos=j;
                    }
                }
                res.add(pos+1);
                int tt[]=new int[pos+1];
                for(int j=0;j<=pos;j++)
                    tt[j]=arr[j];
                for(int j=pos;j>=0;j--)
                    arr[pos-j]=tt[j];
                res.add(n-i);
                int tt2[]=new int[n-i];
                for(int j=0;j<n-i;j++)
                    tt2[j]=arr[j];
                for(int j=n-i-1;j>=0;j--)
                    arr[n-i-1-j]=tt2[j];
            }
            return res;
        }
    }


}
