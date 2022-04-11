public class maximalPathQuality {
    class Solution {
        private int bestValue = 0;
        private int curValue = 0;
        private int curTime = 0;

        private Map<Integer, Map<Integer, Integer>> adj = new HashMap<>();
        private int visitCnt[];

        public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {

            visitCnt = new int[values.length];

            for (int[] edge: edges) {
                if (!adj.containsKey(edge[0])) {
                    adj.put(edge[0], new HashMap<>());
                }
                adj.get(edge[0]).put(edge[1], edge[2]);
                if (!adj.containsKey(edge[1])) {
                    adj.put(edge[1], new HashMap<>());
                }
                adj.get(edge[1]).put(edge[0], edge[2]);
            }
            backtracking(0, values, maxTime);

            return bestValue;
        }

        private void backtracking(int node, int[] values, int maxTime) {

            if (visitCnt[node] == 0) {
                curValue += values[node];
            }

            ++visitCnt[node];

            if (node == 0) {
                bestValue = Math.max(bestValue, curValue);
            }
            if (adj.get(node) != null) {
                for (Map.Entry<Integer, Integer> entry : adj.get(node).entrySet()) {
                    if (curTime + entry.getValue() <= maxTime) {
                        curTime += entry.getValue();
                        backtracking(entry.getKey(), values, maxTime);
                        curTime -= entry.getValue();
                    }
                }
            }

            --visitCnt[node];

            if (visitCnt[node] == 0) {
                curValue -= values[node];
            }
        }
    }
}
