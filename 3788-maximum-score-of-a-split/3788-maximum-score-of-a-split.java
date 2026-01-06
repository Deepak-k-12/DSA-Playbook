class Solution {
    public long maximumScore(int[] nums) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];           
        }
        int suffix[]=new int[nums.length];
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            int min=Math.min(nums[i],suffix[i+1]);
            suffix[i]=min;
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int sum=prefix[i]-suffix[i+1];
            max=Math.max(max,sum);
        }
        return max;
    }
}