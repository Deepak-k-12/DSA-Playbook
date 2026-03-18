class Solution {
    public long[] findPrefixScore(int[] nums) {
       long sum =0;
       long max=0;
       long ans[]=new long[nums.length];
       int j=0;
       for(int i:nums){
            max=Math.max(max,i);
            sum+=(max+i);
            ans[j++]=sum;
       }
       return ans;
    }
}