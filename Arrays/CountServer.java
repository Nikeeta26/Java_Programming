class Solution {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] rowCounts = new int[rows];
        int[] colCounts = new int[cols];

        // Count servers in each row and column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    rowCounts[i]++;
                    colCounts[j]++;
                }
            }
        }

        // Count servers that can communicate
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && (rowCounts[i] > 1 || colCounts[j] > 1)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid1 = {{1, 0}, {0, 1}};
        System.out.println(solution.countServers(grid1)); // Output: 0

        int[][] grid2 = {{1, 0}, {1, 1}};
        System.out.println(solution.countServers(grid2)); // Output: 3

        int[][] grid3 = {
            {1, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1}
        };
        System.out.println(solution.countServers(grid3)); // Output: 4
    }
}
