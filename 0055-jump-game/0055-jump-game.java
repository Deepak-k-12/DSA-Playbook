class Solution {
    public boolean canJump(int[] nums) {
     Boolean dp[]=new Boolean[nums.length];
     return backtrack(0,nums,dp);   
    }

    public boolean backtrack(int in,int[]nums,Boolean []dp){
        if(in==nums.length-1){return true;}
        if(nums[in]==0){return false;}
        if(dp[in]!=null){return dp[in];}
        for(int i=1;i<=nums[in];i++){
            int next=i+in;
            if(next<nums.length){
            if(backtrack(next,nums,dp)){
                dp[in]=true;
                return true;}}
        }
        dp[in]= false;
        return false;
    }
}