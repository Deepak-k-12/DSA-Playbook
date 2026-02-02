class Solution {
    public int jump(int[] nums) {
       int dp[]=new int [nums.length];
       Arrays.fill(dp,-1);
       return backtrack(0,nums,dp); 
    }
    public int backtrack(int in,int[]nums,int []dp){
        if(in>=nums.length-1){return 0;}
        if(nums[in]==0){return (int)1e9;}
        if(dp[in]!=-1){return dp[in];}
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=nums[in];i++){
            min=Math.min(min,1+backtrack(in+i,nums,dp));
        }
        return dp[in]=min;
    }
}