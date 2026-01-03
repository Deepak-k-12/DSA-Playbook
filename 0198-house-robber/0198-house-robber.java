class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return find(nums.length-1,dp,nums);
    }

    public int find(int ind,int[] dp,int[] nums){
        if(ind==0){
            return nums[ind];
        }
        if(ind<0){return 0;}
        if(dp[ind]!=-1){return dp[ind];}
        int pick=nums[ind]+find(ind-2,dp,nums);
        int n_pick=0+find(ind-1,dp,nums);
        dp[ind]=Math.max(pick,n_pick);
        return dp[ind];
    } 
    
}