public class cloneGraph {
    class Solution {
        public Node cloneGraph(Node node) {
            if (node == null) return null;
            Deque<Node> q = new LinkedList<>();
            q.offer(node);
            Map<Integer, Node> map = new HashMap<>();
            map.put(node.val, new Node(node.val));
            while (!q.isEmpty()) {
                Node source = q.poll();
                List<Node> nodes = source.neighbors;
                Node dest = map.get(source.val);
                for (Node n: nodes) {
                    if (!map.containsKey(n.val)) {
                        q.offer(n);
                        map.put(n.val, new Node(n.val));
                    }
                    dest.neighbors.add(map.get(n.val));
                }
            }

            return map.get(node.val);
        }
    }
}
