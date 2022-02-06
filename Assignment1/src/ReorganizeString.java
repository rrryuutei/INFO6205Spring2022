import java.util.Comparator;
import java.util.PriorityQueue;

public class ReorganizeString {
    class Solution {
        class pii {
            char x;
            int cnt;
            pii(char x,int cnt)
            {
                this.x=x;
                this.cnt=cnt;
            }
        }
        public String reorganizeString(String s) {
            PriorityQueue<pii> q=new PriorityQueue<>(new Comparator<pii>() {
                @Override
                public int compare(pii o1, pii o2) {
                    return o2.cnt-o1.cnt;
                }
            });
            int cnt[]=new int[26];
            int maxv=0;
            for(int i=0;i<s.length();i++)
            {
                cnt[s.charAt(i)-'a']++;
                maxv=Math.max(cnt[s.charAt(i)-'a'],maxv);
            }
            if(maxv>s.length()-maxv+1)
            {
                return "";
            }
            String res="";
            for(int i=0;i<26;i++)
            {
                if(cnt[i]>0 )
                    q.offer(new pii((char)(i+'a'),cnt[i]));
            }
            while(q.size()>0)
            {
                pii tt=q.poll();
                if(q.size()==0)
                {
                    res+=tt.x;
                    break;
                }
                else
                {
                    pii tt2=q.poll();
                    res+=tt.x;
                    res+=tt2.x;
                    tt.cnt--;
                    tt2.cnt--;
                    if(tt.cnt>0)
                        q.offer(new pii(tt.x,tt.cnt));
                    if(tt2.cnt>0)
                        q.offer(new pii(tt2.x,tt2.cnt));
                }
            }
            return res;

        }
    }

}
