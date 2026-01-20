class Solution {
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][][]=new int[m][n][n];

        for(int [][] i:dp){
            for(int []j:i){
                Arrays.fill(j,-1);
            }
        }
        return backtrack(0,0,n-1,grid,dp);
    }

    public int backtrack(int i,int j1,int j2,int [][]grid,int [][][] dp){
        if(j1<0 || j2<0 || j1>=grid[0].length || j2>=grid[0].length ){
            return (int)-1e8;
        }
        if(i==grid.length-1){
            if(j1==j2){return grid[i][j1];}
            else{return grid[i][j1]+grid[i][j2];}
        }
        if(dp[i][j1][j2]!=-1){return dp[i][j1][j2];}
        int max=-1;
        for(int r1=-1;r1<=1;r1++){
            for(int r2=-1;r2<=1;r2++){
                if(j1==j2){
                    max=Math.max(max,grid[i][j1]+backtrack(i+1,j1+r1,j2+r2,grid,dp));
                }
                else{
                    max=Math.max(max,grid[i][j1]+grid[i][j2]+backtrack(i+1,j1+r1,j2+r2,grid,dp));

                }
            }
        }
        dp[i][j1][j2]=max;
        return max;
    }
}