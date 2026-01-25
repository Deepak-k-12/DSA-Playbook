class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1 && k==1){return 0;}
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<nums.length){
            if(j-i+1==k){
                min=Math.min(min,(nums[j]-nums[i]));
                i+=1;
            }
            j+=1;
        }
        return min;
    }
}