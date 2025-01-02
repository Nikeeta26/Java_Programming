import java.util.*;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length; // Number of cities
        boolean[] visited = new boolean[n]; // Track visited cities
        int provinces = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                queue.add(i);

                while (!queue.isEmpty()) {
                    int city = queue.poll();
                    visited[city] = true;

                    for (int neighbor = 0; neighbor < n; neighbor++) {
                        if (isConnected[city][neighbor] == 1 && !visited[neighbor]) {
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }

        return provinces;
    }
}
