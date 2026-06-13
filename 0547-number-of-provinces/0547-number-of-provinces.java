class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        visited = Arrays.copyOf(dfsUtil(isConnected, 0, visited), V);
        int provinces = 1;
        for (int v = 0; v < V; v++) {
            if (visited[v] == false) {
                visited = Arrays.copyOf(dfsUtil(isConnected, v, visited), V);
                provinces++;
            }
        }
        return provinces;
    }
    private boolean[] dfsUtil(int[][] isConnected, int start, boolean[] visited) {
        visited[start] = true;
        for (int v = 0; v < visited.length; v++) {
            if (isConnected[start][v] == 1 && !visited[v]) {
                dfsUtil(isConnected, v, visited);
            }
        }
        return visited;
    }
}