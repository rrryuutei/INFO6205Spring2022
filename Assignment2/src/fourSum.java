import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class fourSum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>>res=new ArrayList<>();
            HashSet<ArrayList<Integer>> s=new HashSet<>();
            for(int i=0;i<nums.length-3;i++)//第一个指针
            {
                for(int j=i+1;j<nums.length-2;j++)//第二个指针
                {
                    int k=j+1;
                    int m=nums.length-1; //双指针 m是第四个指针 k是第三个指针
                    //可以发现 对于 k 往右移动 m会逐渐往左
                    while(k<m)
                    {
                        while(k<m)
                        {
                            if(nums[i]+nums[j]+nums[k]+nums[m]>target)
                            {
                                m--;

                            }
                            else
                            {
                                if(nums[i]+nums[j]+nums[k]+nums[m]==target)
                                {
                                    ArrayList<Integer>tmp=new ArrayList<>();
                                    tmp.add(nums[i]);
                                    tmp.add(nums[j]);
                                    tmp.add(nums[k]);
                                    tmp.add(nums[m]);
                                    if(s.contains(tmp)==false) //判断是否四元组出现过
                                    {
                                        res.add(tmp);
                                        s.add(tmp);
                                    }
                                    m--;
                                }
                                else
                                {
                                    break;
                                }
                            }
                        }
                        k++;
                    }
                }
            }
            return res;
        }
    }

}
