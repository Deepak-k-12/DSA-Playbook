public class Solution {
    public bool HasIncreasingSubarrays(IList<int> nums, int k) {
        int length=nums.Count;
        for(int i=0;i+2*k<=length;i++){

            if(Check(nums,i,i+k) && Check(nums,i+k,i+2*k)){
                return true;
            }
        }
        return false;
    }

    public bool Check(IList<int> nums, int start,int end){
        
        for(int i=start;i<end-1;i++){
            if(nums[i]>=nums[i+1]){return false;}
        }
        return true;
    }
}