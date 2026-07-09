class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();

        ArrayList<Integer> temp=new ArrayList<>();

        backtrack(0,ans,temp,nums,-100);
        return new ArrayList<>(ans);

    }

    public void backtrack(int in,Set<List<Integer>> ans,ArrayList<Integer> list,int []nums,int prev){

        if(list.size()>=2){
            ans.add(new ArrayList<>(list));
        }

        if(in>=nums.length) return;

        if(nums[in]>=prev){
            list.add(nums[in]);
            backtrack(in+1,ans,list,nums,nums[in]);
            list.remove(list.size()-1);
        }
        backtrack(in+1,ans,list,nums,prev);
        return;
    }
}