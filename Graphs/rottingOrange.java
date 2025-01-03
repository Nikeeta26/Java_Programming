import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        // Step 1: Add all initial rotten oranges to the queue and count fresh oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j, 0}); // {row, col, time}
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // If there are no fresh oranges, return 0
        if (freshCount == 0) return 0;

        // Step 2: Perform BFS to rot fresh oranges
        int timeElapsed = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0], col = current[1], time = current[2];

            // Update the elapsed time
            timeElapsed = time;

            // Spread rot to adjacent fresh oranges
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2; // Rot the orange
                    freshCount--; // Decrease fresh orange count
                    queue.offer(new int[]{newRow, newCol, time + 1});
                }
            }
        }

        // Step 3: Check if any fresh oranges remain
        return freshCount == 0 ? timeElapsed : -1;
    }
}
