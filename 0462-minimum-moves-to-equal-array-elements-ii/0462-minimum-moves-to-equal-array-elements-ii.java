class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=n%2!=0?nums[n/2]:(nums[n/2-1]+nums[n/2])/2;
        int c=0;;
        for(int i:nums){
            c+=Math.abs(i-a);
        }
        return c;
    }
}