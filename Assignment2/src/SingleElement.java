public class SingleElement {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int n=nums.length;
            int l=0,r=n-1;
//可以发现 在分界点右边的数 偶数位置不等于前一个位置 在分界点左边
// 偶数位置等于奇数位置
            while(r-l>1)
            {
                int mid=(l+r)/2;
                if(mid%2>0) mid--;
                if(nums[mid]!=nums[mid+1])  r=mid;
                else    l=mid+1;
            }
            return nums[r];
        }
    }

}
