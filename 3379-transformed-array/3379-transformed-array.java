class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[i]=nums[(i+nums[i])%n];
            }
            else if(nums[i]<0){
                int a=i+nums[i];
                if(a>=0){ans[i]=nums[a];}
                else{
                    int b = (a % n + n) % n;
                    ans[i] = nums[b];}
            }
            else{
                ans[i]=nums[i];
            }
        }
        return ans;
    }
}