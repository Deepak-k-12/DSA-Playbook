class Solution {
    public int change(int amount, int[] coins) {
        int[][]dp=new int [coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return backtrack(0,amount,coins,0,dp);
    }

    public int backtrack(int in,int tar,int []coins,int sum,int[][] dp){
        if(in==coins.length || sum>tar){return 0;}
        if(sum==tar){return 1;}
        
        if(dp[in][sum]!=-1){return dp[in][sum];}
        int count=0;
        for(int i=in;i<coins.length;i++){
            count+=backtrack(i,tar,coins,sum+coins[i],dp);
            
        }
        return dp[in][sum]=count;
    }
}