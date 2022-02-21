public class FindMinimum {
    class Solution {
        public int findMin(int[] nums) {
            int l=0,r=nums.length-1;
            if(nums[r]>=nums[0])    return nums[0]; //如果整个序列是升序
            while(l<r)
            {
                int mid=(l+r+1)/2;
                if(nums[mid]>=nums[0])  l=mid; //二分找出分界点
                else r=mid-1;
            }
            return nums[l+1];

        }
    }

}
