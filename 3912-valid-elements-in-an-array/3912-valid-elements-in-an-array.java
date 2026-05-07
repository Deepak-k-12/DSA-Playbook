class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(nums[0]);
        int left=nums[0];
        int right=0;
        if(nums.length==1) return ans;
        for(int i=1;i<nums.length-1;i++){
            
            if(nums[i]>left){
                ans.add(nums[i]);
            }
            else{
                right=helper(i+1,nums);
                if(nums[i]>right){
                    ans.add(nums[i]);
                }
            }
            left=Math.max(left,nums[i]);
        }
        ans.add(nums[nums.length-1]);
        return ans;

    }

    public int helper(int st,int nums[]){
        int max=0;
        for(int i=st;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}