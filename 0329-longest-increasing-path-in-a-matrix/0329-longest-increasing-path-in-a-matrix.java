class Solution {
    int dir1[]={-1,1};
    public int longestIncreasingPath(int[][] matrix) {
        int ans=0;
        int dp[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans=Math.max(ans,backtrack(i,j,dp,-1,matrix));
            }
        }
        return ans;
    }

    public int backtrack(int i,int j,int [][] dp,int pre,int[][] matrix){
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length){
            return 0;
        }
        if(matrix[i][j]<=pre){
            return 0;
        }
        if(dp[i][j]!=-1){return dp[i][j];}
        int best=1;

        for(int a:dir1){
            best=Math.max(best,1+backtrack(i,j+a,dp,matrix[i][j],matrix));
            best=Math.max(best,1+backtrack(i+a,j,dp,matrix[i][j],matrix));
        }
        dp[i][j]=best;
        return best;
    }
}