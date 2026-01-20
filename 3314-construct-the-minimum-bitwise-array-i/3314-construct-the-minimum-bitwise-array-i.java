class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]=new int[nums.size()];
        int in=0;
        for(int i:nums){
            ans[in]=-1;
            for(int j=0;j<=i;j++){
                if((j|(j+1))==i){
                    ans[in]=j;
                    break;
                }
            }
            in+=1;
        }
        return ans;
    }
}