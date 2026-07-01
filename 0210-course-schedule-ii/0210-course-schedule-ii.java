class Solution {
    public int[] findOrder(int V, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        int[] inDegree = new int[V];
        for (int[] e : edges) {
            int u = e[1], v = e[0];
            inDegree[v]++;
            graph.get(u).add(v);
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) q.offer(i);
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);
            for (int i = 0; i < graph.get(curr).size(); i++) {
                inDegree[graph.get(curr).get(i)]--;  // on google, search inOrder vs inDegree in graph
                if (inDegree[graph.get(curr).get(i)] == 0) q.offer(graph.get(curr).get(i));
            }
        }
        if (res.size() != V) return new int[]{};
        int[] result = new int[V];
        for (int i = 0; i < V; i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}