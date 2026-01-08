class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        if(n==1){return grid[0][0];}
        int dp[][]=new int[n][n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],100);}

        for (int i = 0; i < n; i++) {
            int ans = grid[n - 1][i] + backtrack(n - 2, grid, i,dp);
            min = Math.min(min, ans);
        }
        return min;
    }

    public int backtrack(int k, int[][] grid, int prevCol,int [][]dp) {
        if (k < 0) {
            return 0;
        }
        
        if(dp[k][prevCol]!=100){return dp[k][prevCol];}
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < grid.length; i++) {
            if (i != prevCol) {
                int ans = grid[k][i] + backtrack(k - 1, grid, i,dp);
                min = Math.min(min, ans);
            }
        }
        dp[k][prevCol]=min;
        return min;
    }
}
