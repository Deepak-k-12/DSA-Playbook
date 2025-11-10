class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        check(0,nums,ans,new ArrayList<>());
        return ans;
    }

    public void check(int i,int nums[],List<List<Integer>> ans,List<Integer> demo){
        ans.add(new ArrayList<>(demo));
        for(int st=i;st<nums.length;st++){
            if(st>i && nums[st]==nums[st-1]){continue;}
            demo.add(nums[st]);
            check(st+1,nums,ans,demo);
            demo.remove(demo.size()-1);
        }
    }

}