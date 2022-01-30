public class MajorityElementII {
     public List<Integer> majorityElement(int[] nums) {
            Arrays.sort(nums);
            List<Integer>res=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                int j=i;
                while(j<nums.length && nums[j]==nums[i])
                    j++;
                if(j-i>(nums.length)/3)
                    res.add(nums[i]);
                i=j-1;

            }
            return res;

        }



}
