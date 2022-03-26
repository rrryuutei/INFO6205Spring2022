import java.util.ArrayList;

public class Question1 {
    class Solution {
        public List<String> findRanges(int[] nums, int lower, int upper) {
            List<String> res = new ArrayList<>();
            int nums1= nums.length;
            if (nums1 < 1) {
                if (lower < upper) {
                    res.add(lower + "->" + upper);
                } else {
                    res.add(String.valueOf(lower));
                }
                return res;
            }
            if (lower < nums[0]) {
                if (nums[0] - lower == 1) {
                    res.add(String.valueOf(lower));
                } else {
                    res.add(lower + "->" + (nums[0] - 1));
                }
            }
            for (int i = 0; i < nums1 - 1; ++i) {
                if (nums[i + 1] - nums[i] == 1) {
                    continue;
                } else if (nums[i + 1] - nums[i] == 2) {
                    res.add(String.valueOf(nums[i] + 1));
                } else {
                    res.add((nums[i] + 1) + "->" + (nums[i + 1] - 1));
                }
            }
            if (nums[nums1 - 1] < upper) {
                if (upper - nums[nums1 - 1] == 1) {
                    res.add(String.valueOf(upper));
                } else {
                    res.add((nums[nums1 - 1] + 1) + "->" + upper);
                }
            }
            return res;
        }
    }

   
        }

