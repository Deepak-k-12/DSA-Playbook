class Solution {
    public int smallestBalancedIndex(int[] nums) {

        long suf[]=new long [nums.length+1];
        long limit = (long)1e14 + 1;

        suf[nums.length]=1;

        for(int i=nums.length-1;i>=0;i--){
            if(suf[i+1] > limit / nums[i]){
                suf[i] = limit;
            }
            else{
                suf[i] = nums[i] * suf[i+1];
            }
        }

        int in=-1;
        long leftsum=0;

        for(int i=0;i<nums.length;i++){
            long next=suf[i+1];
            if(leftsum==next) return i;
            leftsum+=nums[i];           
        }

        return in;
    }
}