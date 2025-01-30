class Solution {

    public static int findMaxFish(int[][] grid) {
        int maxFish = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Helper method for DFS
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] > 0) {
                    maxFish = Math.max(maxFish, dfs(grid, r, c, directions));
                }
            }
        }

        return maxFish;
    }

    private static int dfs(int[][] grid, int r, int c, int[][] directions) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        int fish = grid[r][c]; // Catch fish in the current cell
        grid[r][c] = 0; // Mark cell as visited

        // Explore all adjacent cells
        for (int[] dir : directions) {
            fish += dfs(grid, r + dir[0], c + dir[1], directions);
        }

        return fish;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
            {0, 2, 1, 0},
            {4, 0, 0, 3},
            {1, 0, 0, 4},
            {0, 3, 2, 0}
        };

        int[][] grid2 = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 1}
        };

        System.out.println(findMaxFish(grid1)); // Output: 7
        System.out.println(findMaxFish(grid2)); // Output: 1
    }
}

// dfs(grid, r + 1, c, directions); // r = 1, c = 0 → r + 1 = 2, c = 0
    //fish = grid[2][0]; // grid[2][0] = 1
//dfs(grid, r + 1, c, directions); // r = 2, c = 0 → r + 1 = 3, c = 0
 
//dfs(grid, r, c + 1, directions); // r = 2, c = 0 → r = 2, c + 1 = 1

//dfs(grid, r + 1, c, directions); // r = 2, c = 0 → r + 1 = 3, c = 0

//dfs(grid, r - 1, c, directions); // r = 2, c = 0 → r - 1 = 1, c = 0

//dfs(grid, r, c + 1, directions); // r = 2, c = 0 → r = 2, c + 1 = 1

//dfs(grid, r, c - 1, directions); // r = 2, c = 0 → r = 2, c - 1 = -1
