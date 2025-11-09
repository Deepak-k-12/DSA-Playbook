class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int moves=0;
        for(int i=0;i<nums.length;i++){
            moves+=Math.abs(max-nums[i]);
        }
        return moves;
    }
}