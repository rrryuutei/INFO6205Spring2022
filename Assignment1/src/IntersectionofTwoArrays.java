import java.util.Arrays;
import java.util.TreeSet;
import java.util.Vector;

public class IntersectionofTwoArrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            TreeSet<Integer> s=new TreeSet<>();//define set
            for(int i=0;i<nums1.length;i++)
            {
                s.add(nums1[i]); //Insert the elements of num1 into the set
            }
            Vector<Integer> v=new Vector<>();
            for(int i=0;i<nums2.length;i++)
            {
                if(i>0 && nums2[i]==nums2[i-1]) continue;
                if(s.contains(nums2[i]))
                {
                    v.add(nums2[i]);
                }
            }
            int res[]=new int[v.size()];
            int cnt=0;
            for(int x:v)
            {
                res[cnt++]=x;
            }
            return res;
        }
    }

}
