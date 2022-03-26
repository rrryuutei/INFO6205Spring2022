import java.util.ArrayList;

public class Question1 {
    class solution{
        public List <String> findRanges(int[]nums,int lower,int upper){

    List<String> res =new ArrayList<>();
    long Lower1= (long) lower;
    long upper1 = (long) upper;

    for(int num:nums){
    if (num == lower1){
        lower1++；

    } else if (lower1 < num) {
        if (lower1+1 == num){
            res.add(String.valueOf(lower1));
        }
    }
    }
    else{
        res.add(lower1+"->"+(num-1));
    }
    lower1 = (long) num+1 ;
 }
    if (lower1 == upper1){
     res.add(String.ValueOf(lower1));

} else if{
         (lower1<uppper1)
 res.add(lower1+"->"+upper1);
        }
 retuen.res;
        }
        }

