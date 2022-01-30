import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindKClosestElements {

    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            ArrayList<Integer> v=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=arr[i]-x; //将数组变为差值 然后排序
                v.add(arr[i]);
            }
            //按照绝对值排序
            Collections.sort(v, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return Math.abs(o1)-Math.abs(o2);
                }
            });

            //找出最靠近0的k个数
            List<Integer>res=new ArrayList<>();
            for(int i=0;i<k;i++)
            {
                res.add(x+v.get(i));
            }
            Collections.sort(res);
            return res;
        }
    }





}
