class Solution {
    public long rob(int[] nums, int[] colors) {
        long dp[][]=new long[nums.length][2];
        for(long []i:dp){
            Arrays.fill(i,-1);
        }
        return backtrack(0,0,nums,colors,dp);
    }

    public long backtrack(int in ,int prev,int[] nums,int colors[],long[][] dp){
        if(in==nums.length){return 0;}
        if(dp[in][prev]!=-1){return dp[in][prev];}

        long take=0;
        if(prev==0 || prev==1 && colors[in]!=colors[in-1]){
            take=nums[in]+backtrack(in+1,1,nums,colors,dp);
        }
        long nottake=backtrack(in+1,0,nums,colors,dp);

        return dp[in][prev]=Math.max(take,nottake);
    }
}