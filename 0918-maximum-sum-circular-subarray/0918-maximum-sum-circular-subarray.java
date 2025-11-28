class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int max_sum=0;
        int min=Integer.MAX_VALUE;
        int min_sum=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max_sum+=nums[i];
            min_sum+=nums[i];
            max=Math.max(max,max_sum);
            min=Math.min(min,min_sum);
            if(max_sum<0){max_sum=0;}
            if(min_sum>0){min_sum=0;}
        }

        if(max<0){return max;}
        return Math.max(max,sum-min);
        
    }
}