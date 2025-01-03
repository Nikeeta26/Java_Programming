import java.util.*;

public class MinReorderBFS {
    public int minReorder(int n, int[][] connections) {
        // Step 1: Build the graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] connection : connections) {
            int a = connection[0], b = connection[1];
            graph.get(a).add(new int[]{b, 1}); // Edge needs reversing
            graph.get(b).add(new int[]{a, 0}); // Edge doesn't need reversing
        }

        // Step 2: BFS traversal
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int reversals = 0;

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0], cost = neighbor[1];
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    reversals += cost; // Add cost if the edge needs reversing
                    queue.add(nextNode);
                }
            }
        }

        return reversals;
    }

    public static void main(String[] args) {
        MinReorderBFS solution = new MinReorderBFS();

        // Example 1
        int n1 = 6;
        int[][] connections1 = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        System.out.println(solution.minReorder(n1, connections1)); // Output: 3

        // Example 2
        int n2 = 5;
        int[][] connections2 = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        System.out.println(solution.minReorder(n2, connections2)); // Output: 2

        // Example 3
        int n3 = 3;
        int[][] connections3 = {{1, 0}, {2, 0}};
        System.out.println(solution.minReorder(n3, connections3)); // Output: 0
    }
}
