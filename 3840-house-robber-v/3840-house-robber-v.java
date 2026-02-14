class Solution {
    public long rob(int[] nums, int[] colors) {
        long p1=0;
        long p2=nums[0];
        long p3=0;

        for(int i=1;i<nums.length;i++){
            if(colors[i]==colors[i-1]){
                p3=nums[i]+p1;
                p1=p2;
                p2=Math.max(p2,p3);
            }
            else{
                p3=nums[i]+p2;
                p1=p2;
                p2=p3;
            }
        }
        return Math.max(p2,p3);
    }
}