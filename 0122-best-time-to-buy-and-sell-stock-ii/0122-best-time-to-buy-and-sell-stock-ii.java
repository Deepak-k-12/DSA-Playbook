class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return backtrack(0,prices,1);
    }
    public int backtrack(int in,int[] prices,int flag){
        if(in==prices.length){
            return 0;
        }
        if(dp[in][flag]!=-1) return dp[in][flag];
        int s1=0,s2=0;
        if(flag==1){
            s1=Math.max(-prices[in]+backtrack(in+1,prices,0),backtrack(in+1,prices,flag));
        }
        else{
            s2=Math.max(prices[in]+backtrack(in+1,prices,1),backtrack(in+1,prices,flag));
        }
        return dp[in][flag]=s1+s2;
    }
}