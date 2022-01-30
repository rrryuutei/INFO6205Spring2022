public class SortColors {

    class Solution {
        public void sortColors(int[] nums) {
            int cnt[]=new int[3];
            for(int x:nums)
            {
                cnt[x]+=1;
            }
            int id=0;
            for(int i=0;i<3;i++)
            {
                while(cnt[i]>0)
                {
                    cnt[i]--;
                    nums[id++]=i;
                }
            }
        }
    }
}
