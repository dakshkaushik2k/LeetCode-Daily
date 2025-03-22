import java.util.*;

class countCompleteComponents {
    public void dfs(int ele, List<List<Integer>> adj, boolean[] vis, List<Integer> component) {
        vis[ele] = true;
        component.add(ele);
        for (int i : adj.get(ele)) {
            if (!vis[i]) {
                dfs(i, adj, vis, component);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        
        // Initialize adjacency list with independent lists
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int[] edge : edges) {
            int first = edge[0];
            int second = edge[1];

            adj.get(first).add(second);
            adj.get(second).add(first);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, adj, vis, component);

                // Check if the component is complete
                boolean isComplete = true;
                for (int node : component) {
                    if (adj.get(node).size() != component.size() - 1) {
                        isComplete = false;
                        break;
                    }
                }

                if (isComplete) cnt++;
            }
        }
        return cnt;
    }
}
