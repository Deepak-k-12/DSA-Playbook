class Solution {
    int dp[][][];
    public int maxProfit(int[] prices) {
        dp=new int [prices.length][2][3];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return backtrack(0,prices,1,2);
    }

    public int backtrack(int in,int []prices,int flag,int c){
        if(c==0) return 0;

        if(in>=prices.length) return 0;
        if(dp[in][flag][c]!=-1) return dp[in][flag][c];

        int s1=0,s2=0;
        if(flag==1){
            s1=Math.max(-prices[in]+backtrack(in+1,prices,0,c),backtrack(in+1,prices,flag,c));
        }
        else{
            s2=Math.max(prices[in]+backtrack(in+1,prices,1,c-1),backtrack(in+1,prices,flag,c));
        }
        return dp[in][flag][c]=s1+s2;
    }
}