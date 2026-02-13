class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(backtrack(0,cost,dp),backtrack(1,cost,dp));
    }

    public int backtrack(int i,int []cost,int []dp){
        if(i>=cost.length){return 0;}
        if(dp[i]!=-1){return dp[i];}
        
        int step1=cost[i]+backtrack(i+1,cost,dp);
        int step2=cost[i]+backtrack(i+2,cost,dp);
       
        return dp[i]=Math.min(step1,step2);
    }

}