class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        int dp[][]=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            Arrays.fill(dp[i],-1);
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]!=0){
                    count+=backtrack(i,j,matrix,dp);
                }
            }
        }
        return count;
    }

    public int backtrack(int i,int j,int[][] matrix,int [][]dp){
        if(i<0 || j<0 || matrix[i][j]==0){return 0;}

        if(dp[i][j]!=-1){return dp[i][j];}

        int left=backtrack(i,j-1,matrix,dp);
        int up=backtrack(i-1,j,matrix,dp);
        int dig=backtrack(i-1,j-1,matrix,dp);

        dp[i][j]=1+Math.min(left,Math.min(up,dig));
        return dp[i][j];
    }       
}