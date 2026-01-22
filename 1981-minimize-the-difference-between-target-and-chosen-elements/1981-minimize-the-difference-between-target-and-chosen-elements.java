class Solution {
    int min=Integer.MAX_VALUE;
    public int minimizeTheDifference(int[][] mat, int target) {
        int dp[][]=new int[mat.length][5000];
        
        for(int i=0;i<mat.length;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        backtrack(0,0,target,mat,dp);   
        return min;
    }

    public void backtrack(int row,int sum,int t,int[][] mat,int[][]dp){
        if(row==mat.length){
            min=Math.min(min,Math.abs(sum-t));
            return;
        }
        if(dp[row][sum]!=Integer.MAX_VALUE){
             min=Math.min(min,dp[row][sum]);
             return;
        }
        int localMin =Integer.MAX_VALUE;

        for (int i=0;i<mat[row].length; i++) {
            backtrack(row + 1,sum+mat[row][i],t,mat,dp);
            localMin = Math.min(localMin, min);
        }

        dp[row][sum] = localMin;
    }
}