class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int freq[]=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]+=1;
        }
        int mid=nums.length/2;

        return freq[nums[mid]]==1;

    }
}