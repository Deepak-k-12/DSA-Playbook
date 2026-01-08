class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        if(n==1){return grid[0][0];}
        int dp[][]=new int[n][n];

        for(int i=0;i<n;i++){    
            dp[0][i]=grid[0][i];
            }
         int ans = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int min = Integer.MAX_VALUE;
                for(int c=0;c<n;c++){
                    if(j!=c){
                         min=Math.min(dp[i-1][c],min);
                    }
                }
                dp[i][j] = grid[i][j] + min;
                if(i==n-1){
                    ans=Math.min(ans,dp[i][j]);
                }
            }
        }

        return ans;

        


        
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
