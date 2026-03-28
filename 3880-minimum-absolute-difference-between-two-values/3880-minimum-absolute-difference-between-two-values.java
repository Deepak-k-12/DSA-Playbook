class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        int c1=-1;
        int c2=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c1=i;
                if(c2!=-1){
                    min=Math.min(min,Math.abs(c1-c2));
                }
            }
            else if(nums[i]==2){
                c2=i;
                if(c1!=-1){
                   min=Math.min(min,Math.abs(c1-c2));
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}