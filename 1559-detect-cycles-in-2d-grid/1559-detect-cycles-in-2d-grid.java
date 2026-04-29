class Solution {
    public boolean containsCycle(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean visited[][] = new boolean[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    if (dfs(grid, visited, i, j, -1, -1, grid[i][j])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] grid, boolean[][] visited, int row, int col, int r1, int c1, char target) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return false;
        }
        
        if (grid[row][col] != target) {
            return false;
        }

        if (visited[row][col]) {
            return true;
        }

        visited[row][col] = true;

        if (!(row - 1 == r1 && col == c1)) {
            if (dfs(grid, visited, row - 1, col, row, col, target)) return true;
        }
        if (!(row + 1 == r1 && col == c1)) {
            if (dfs(grid, visited, row + 1, col, row, col, target)) return true;
        }
        if (!(row == r1 && col + 1 == c1)) {
            if (dfs(grid, visited, row, col + 1, row, col, target)) return true;
        }
        if (!(row == r1 && col - 1 == c1)) {
            if (dfs(grid, visited, row, col - 1, row, col, target)) return true;
        }

        return false;
    }
}