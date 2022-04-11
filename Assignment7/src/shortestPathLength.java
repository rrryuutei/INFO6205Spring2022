public class shortestPathLength {
    class Solution {
        public int shortestPathLength(int[][] graph) {
            int n = graph.length;
            int cnt = (1 << n) - 1;
            int ans = Integer.MAX_VALUE;
            int[][] v = new int[n][1 << 12];
            Queue<int[]> queue = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                // 当前节点，当前经过的点，当前步数
                v[i][1 << i] = 1;
                queue.add(new int[]{i, 1 << i, 0});
            }
            while(!queue.isEmpty()) {
                int[] cur = queue.poll();
                int x = cur[0];
                int bit = cur[1];
                int step = cur[2];
                if (bit == cnt) return step;
                for (int nx : graph[x]) {
                    int nb = bit | (1 << nx);
                    if (v[nx][nb] == 1) continue;
                    v[nx][nb] = 1;
                    queue.add(new int[]{nx, nb, step + 1});
                }
            }
            return -1;
        }
    }
}
