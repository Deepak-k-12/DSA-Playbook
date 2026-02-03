class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<=3){return false;}
        if(nums[0]>=nums[1]){return false;}
        int in=0;
        boolean first=false,second=false,third=false;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                in=i;
                first=true;
                break;
            }
        }
        if(!first){return false;}
        for(int i=in;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                in=i;
                second=true;
                break;
            }
        }
        if(!second){return false;}
        
        for(int i=in;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
}}