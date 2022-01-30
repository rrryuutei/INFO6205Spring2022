import java.util.Arrays;

public class SumClosest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int maxv=0x3f3f3f3f;
            int n=nums.length;
            //对数列排序 枚举 ij指针 然后二分找到 三数和大于等于target的第一个位置 和 三数之和小于等于target的最后一个位置 更新答案
            for(int i=0;i<n-2;i++)
            {
                for(int j=i+1;j<n-1;j++)
                {
                    int l=j+1,r=n-1;

                    while(l<r)
                    {
                        int mid=(l+r+1)/2;
                        if(nums[i]+nums[j]+nums[mid]<=target)   l=mid;
                        else    r=mid-1;
                    }
                    if(Math.abs(nums[i]+nums[j]+nums[l]-target)<=Math.abs(maxv-target))
                    {
                        maxv=nums[i]+nums[j]+nums[l];
                    }
                    l=j+1;
                    r=n-1;
                    while(l<r)
                    {
                        int mid=(l+r)/2;
                        if(nums[i]+nums[j]+nums[mid]>=target)   r=mid;
                        else    l=mid+1;
                    }
                    if(Math.abs(nums[i]+nums[j]+nums[l]-target)<=Math.abs(maxv-target))
                    {
                        maxv=nums[i]+nums[j]+nums[l];
                    }
                }
            }
            return maxv;
        }
    }

}
