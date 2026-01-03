class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}
        int t1[]=new int[nums.length-1];
        int t2[]=new int[nums.length-1];
        
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                t1[i-1]=nums[i];
            }
            if(i!=nums.length-1){
                t2[i]=nums[i];
            }
        }
        int ans1=solve(t1);
        int ans2=solve(t2);
        return Math.max(ans1,ans2);
    }

    public int solve(int []nums){
        if(nums.length==1){return nums[0];}
        int p2=nums[0];
        int p1=Math.max(p2,nums[1]);

        for(int i=2;i<nums.length;i++){
            int curr=nums[i]+p2;
            p2=p1;
            p1=Math.max(p1,curr);
        }
        return p1;
    }
}