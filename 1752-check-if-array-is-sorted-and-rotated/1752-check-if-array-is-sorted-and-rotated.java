class Solution {
    public boolean check(int[] nums) {
        int c=0,s=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                c+=1;
                s=i+1;
            }
        }
       
        if(c>1){
            return false;
        }
         if(c==0) {
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(i<s-1){
            if(nums[i]>nums[i+1]){
                return false;
            }}
            else if(i>=s){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
        }

        if(nums[nums.length- 1]>nums[0]){
            return false;
        }
        return true;
        
    }
}