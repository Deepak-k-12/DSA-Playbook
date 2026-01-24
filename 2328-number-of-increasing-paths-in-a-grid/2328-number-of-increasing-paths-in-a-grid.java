class Solution {
    int mod=1000000007;
    public int countPaths(int[][] grid) {
        long sum=0;
        int dp[][]=new int [grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            Arrays.fill(dp[i],-1);
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum=(sum+backtrack(i,j,-1,grid,dp))%mod;
            }
        }
        return (int)sum;
    }

    public long backtrack(int i,int j,int prev,int[][]grid,int [][] dp){
        if(j<0 || i<0 || j>=grid[0].length || i>=grid.length){return 0;}
        if(prev>=grid[i][j]){return 0;}
        if(dp[i][j]!=-1){return dp[i][j];}
        long left=backtrack(i,j-1,grid[i][j],grid,dp);
        long right=backtrack(i,j+1,grid[i][j],grid,dp);
        long up=backtrack(i-1,j,grid[i][j],grid,dp);
        long down=backtrack(i+1,j,grid[i][j],grid,dp);

        dp[i][j]= (int)(1+left+right+up+down)%mod;
        return dp[i][j];
    }

}