import java.util.Arrays;

public class HIndex {
    class Solution {
        public int hIndex(int[] city) {
            Arrays.sort(city);
            int res=0;
            for(int i=city.length-1;i>=0;i--)
            {
                if(city.length-i<=city[i])
                {
                    res=city.length-i;
                }
            }
            return res;

        }
    }

    }



