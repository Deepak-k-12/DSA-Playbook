class Solution {
    public boolean canPartition(int[] nums) {
     int sum=0;
     for(int i:nums){
        sum+=i;
        }
     if(sum%2!=0){return false;}
     int [][]dp=new int [nums.length][sum/2+1];
     for(int i=0;i<nums.length;i++){
        Arrays.fill(dp[i],-1);
     }
     return backtrack(nums.length-1,sum/2,nums,dp);
    }

    public boolean backtrack(int in,int tar,int nums[],int [][]dp){
        if(tar==0){return true;}
        if(in==0){
            return tar==nums[in];
        }
        if(dp[in][tar]!=-1){return dp[in][tar]==1;}
        boolean notpick=backtrack(in-1,tar,nums,dp);
        boolean pick=false;
        if(tar>=nums[in]){
            pick=backtrack(in-1,tar-nums[in],nums,dp);
        }
        dp[in][tar]=(pick || notpick)?1:0;
        return pick || notpick;
    }
}