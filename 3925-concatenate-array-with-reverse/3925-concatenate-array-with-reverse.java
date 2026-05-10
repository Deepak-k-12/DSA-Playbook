class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[]=new int[2*(nums.length)];
        int j=nums.length-1;
        for(int i=0;i<ans.length;i++){
            if(i>=nums.length){
                ans[i]=nums[j];
                j--;
            }
            else{
            ans[i]=nums[i];
            }
        }
        return ans;
    }
}