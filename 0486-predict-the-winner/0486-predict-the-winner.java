class Solution {
    // Boolean dp[][][];
    public boolean predictTheWinner(int[] nums) {
        //dp=new Boolean[nums.length][nums.length][2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j[]:dp){
        //         Arrays.fill(j,false);
        //     }
        // }
        return backtrack(nums,0,nums.length-1,0,0,0);
   }

   public boolean backtrack(int nums[],int st,int ed,int sum1,int sum2,int flag){
                  
       
        if(st>ed){
            if(sum1>=sum2){
                return true;
            }
            return false;
        }

        //if(dp[st][ed][flag]!=null) return dp[st][ed][flag];
        boolean b1=false;
        boolean b2=false;
        boolean b3=false;
        boolean b4=false;
        if(flag==0){
            b1=backtrack(nums,st+1,ed,sum1+nums[st],sum2,1);
            b2=backtrack(nums,st,ed-1,sum1+nums[ed],sum2,1);
            //dp[st][ed][flag]=b1||b2;
            return b1 || b2;
        }
        else{
            b3=backtrack(nums,st+1,ed,sum1,sum2+nums[st],0);
            b4=backtrack(nums,st,ed-1,sum1,sum2+nums[ed],0);
            ///dp[st][ed][flag]=b3 && b4;
           return b4 && b3;
        }
   }
}