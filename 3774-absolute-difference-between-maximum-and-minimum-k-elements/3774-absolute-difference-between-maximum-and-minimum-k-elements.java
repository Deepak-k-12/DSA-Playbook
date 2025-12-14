class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=0;
        int max=0;
        for(int i=0;i<k;i++){
            min+=nums[i];
            max+=nums[nums.length-1-i];
        }
        return Math.abs(min-max);
    }
}