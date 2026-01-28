class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       
        int tat=0;
        for(int i:nums){tat+=i;}
         int dp[][]=new int[nums.length][(2*tat)+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return backtrack(0,nums,target,dp,tat);
    }

    public int backtrack(int in,int[]nums,int tar,int [][]dp,int off){
        
        if(in==nums.length) {return tar==0?1:0;}
        if(tar<-off || tar>off){return 0;}
        if(dp[in][tar+off]!=-1){return dp[in][tar+off];}

        int pick=backtrack(in+1,nums,tar-nums[in],dp,off);
        int notpick=backtrack(in+1,nums,tar+nums[in],dp,off);
        return dp[in][tar+off]=pick+notpick;

    }
}