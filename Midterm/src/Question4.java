import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question4{
    class Solution {
        public int[][] merge(int[][] a) {
            int n=a.length;
            int count=0;
            if(n==0)
                return new int[][]{};
            for(int i=0;i<n-1;i++){
                if(a[i]==null)
                    continue;
                int s=a[i][0],t=a[i][a[i].length-1];
                for(int j=i+1;j<n;j++){
                    if(a[j]!=null){
                        int p=a[j][0],q=a[j][a[j].length-1];
                        if((p<=t&&p>=s)||(s>=p&&s<=q))
                        {
                            count++;
                            a[j][0]=Math.min(a[j][0],a[i][0]);
                            a[j][a[j].length-1]=Math.max(a[j][a[j].length-1],a[i][a[i].length-1]);
                            a[i]=null;
                            break;
                        }
                    }
                }
            }
            int[][] res=new int[n-count][2];
            int m=0;
            for(int i=0;i<a.length;i++){
                if(a[i]!=null)
                    res[m++]=a[i];
            }
            return res;
        }
    }

}



