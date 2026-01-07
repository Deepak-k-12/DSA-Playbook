class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[0][0]=grid[0][0];
                    continue;}
                int down=100000;
                int right=100000;
                if(i>0){ 
                down=grid[i][j]+dp[i-1][j];}
                if(j>0){
                    right=grid[i][j]+dp[i][j-1];
                }
                dp[i][j]=Math.min(down,right);
            }
        }
        return dp[m-1][n-1];
        
    }

    public int backtrack(int i,int j,int [][]grid,int [][]dp){
        if(i==0 && j==0){return grid[0][0];}
        if(i<0 || j<0){return 1000000;}
        if(dp[i][j]!=-1){return dp[i][j];}
        
        int up=grid[i][j]+backtrack(i-1,j,grid,dp);
        int left=grid[i][j]+backtrack(i,j-1,grid,dp);
        dp[i][j]=Math.min(up,left);
        return dp[i][j];
        
    }
}