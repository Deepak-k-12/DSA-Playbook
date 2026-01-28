class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0){return 0;}

        int dp[][] = new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i], -1);
        }

        int ans = backtrack(0, amount, 0, coins, dp);

        if(ans >=(int)1e9){
            return -1;
        }
        return ans;
    }

    public int backtrack(int in, int tar, int c, int[] coins, int[][] dp){
        if(tar == 0){
            return 0;
        }
        if(in == coins.length || tar < 0){
            return (int) 1e9;
        }

        
        if(dp[in][tar] != -1){
            return dp[in][tar];
        }

        int pick =1+ backtrack(in, tar - coins[in], c + 1, coins, dp);
        int notpick = backtrack(in + 1, tar, c, coins, dp);

        return dp[in][tar] = Math.min(pick, notpick);
    }
}
