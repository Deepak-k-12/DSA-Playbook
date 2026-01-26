class Solution {
    public int minimumPrefixLength(int[] nums) {
        int len=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                len=i+1;
            }
        }
        return len;
    }
}