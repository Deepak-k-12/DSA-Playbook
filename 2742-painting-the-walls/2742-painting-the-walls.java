class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int dp[][]=new int [cost.length+1][cost.length+1];
        for(int  i=0;i<=cost.length;i++){{
            Arrays.fill(dp[i],-1);
        }}
        return backtrack(0,cost,time,cost.length,dp);
        
    }
    public int backtrack(int in,int []cost ,int []time,int remaing,int[][]dp){
        if(remaing<=0){return 0;}

        if(in==cost.length){return (int)1e9;}
        if(dp[in][remaing]!=-1){return dp[in][remaing];}

        int pick=cost[in]+backtrack(in+1,cost,time,(remaing-(time[in]+1)),dp);
        int notpick=backtrack(in+1,cost,time,remaing,dp);

        
        return dp[in][remaing]=Math.min(pick,notpick);
    }
}