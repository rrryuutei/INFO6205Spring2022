import java.util.Arrays;
import java.util.Comparator;

public class SortArrayByIncreasingFrequency {
    class Solution {
        class node{
            int val;
            int cnt;
            node(int val,int cnt)
            {
                this.val=val;
                this.cnt=cnt;
            }
        }
        public int[] frequencySort(int[] nums) {
            int cnt[]=new int[210];
            for(int i:nums)
            {
                cnt[i+100]++; //因为有负数，所有要变成非负数
            }
            node arr[]=new node[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                arr[i]=new node(nums[i],cnt[nums[i]+100]);
            }
            Arrays.sort(arr, new Comparator<node>() {
                @Override

                public int compare(node o1, node o2) {
                    if(o1.cnt!=o2.cnt)//如果数量不同 按照数量升序
                    {
                        return o1.cnt-o2.cnt;
                    }
                    return o2.val-o1.val;//否则按照value降序
                }
            });
            for(int i=0;i<arr.length;i++) { //赋值给答案数组
                nums[i]=arr[i].val;
            }
            return nums;
        }
    }

}
