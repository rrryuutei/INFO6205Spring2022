public class searchInsert {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int n=nums.length;
            if(target>nums[n-1])//如果target是最大值 ，那么就是插到最后
                return n;
            int l=0,r=n-1;
            while(l<r) //二分查找
            {
                int mid=(l+r)/2;
                if(nums[mid]>=target)   r=mid;
                else    l=mid+1;
            }
            return l;
        }
    }

}
