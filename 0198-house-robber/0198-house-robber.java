class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}
        int p1=nums[1];
        int p2=nums[0];
        p1=Math.max(p1,p2);

        for(int i=2;i<nums.length;i++){
            int curr=nums[i]+p2;
            p2=p1;
            p1=Math.max(curr,p2);
        }
        return p1;
    }
}