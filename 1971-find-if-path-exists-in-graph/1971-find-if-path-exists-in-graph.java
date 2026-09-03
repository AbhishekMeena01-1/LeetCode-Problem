class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Adjacency List
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, adj, visited);
    }

    public boolean dfs(int curr, int destination,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited) {

        // destination mil gaya
        if(curr == destination) {
            return true;
        }

        visited[curr] = true;

        // current node ke neighbours
        for(int neighbour : adj.get(curr)) {

            if(!visited[neighbour]) {

                if(dfs(neighbour, destination, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}