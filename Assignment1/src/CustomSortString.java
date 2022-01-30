import java.util.Arrays;
import java.util.Comparator;

public class CustomSortString {

    class Solution {
        private class letter{
            char x;
            int time;
            letter(char x,int time)
            {
                this.x=x;
                this.time=time;
            }
        }
        public String customSortString(String order, String s) {
            int value[]=new int[26];
            for(int i=0;i<26;i++)   value[i]=-1;
            for(int i=0;i<order.length();i++)
            {
                value[order.charAt(i)-'a']=i;
            }
            letter a[]=new letter[s.length()];
            for(int i=0;i<s.length();i++)
            {
                a[i]=new letter(s.charAt(i),value[s.charAt(i)-'a']);
            }
            //按照时间排序
            Arrays.sort(a, new Comparator<letter>() {
                @Override
                public int compare(letter o1, letter o2) {
                    return o1.time-o2.time;
                }
            });
            String res="";//答案
            for(int i=0;i<a.length;i++)
            {
                res+=a[i].x;
            }
            return res;
        }
    }















}