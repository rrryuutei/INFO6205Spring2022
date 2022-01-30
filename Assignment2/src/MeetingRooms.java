public class MeetingRooms {
    class Solution {
        public int minMeetingRooms(int[][] intervals) {
            int n=intervals.length;
            int d[]=new int[1000010];
            for(int i=0;i<n;i++)
            {
                d[intervals[i][0]]++;
                d[intervals[i][1]]--;
            }
            int maxv=0;
            for(int i=0;i<=1000000;i++)
            {
                if(i>=1)
                    d[i]+=d[i-1];
                maxv=Math.max(maxv,d[i]);
            }
            return maxv;
        }
    }

}
