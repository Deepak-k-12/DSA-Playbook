class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans=new HashSet<List<Integer>>();
        boolean arr[]=new boolean[nums.length];
        check(nums,arr,ans,new ArrayList<>());
        List<List<Integer>> answer=new ArrayList<List<Integer>>(ans);
        return answer;
    }

    public void check(int[] nums,boolean arr[],Set<List<Integer>> ans,ArrayList<Integer> demo){
        if(demo.size()==nums.length){
            if(!ans.contains(demo)){ans.add(new ArrayList<>(demo));};
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                demo.add(nums[i]);
                arr[i]=true;
                check(nums,arr,ans,demo);
                demo.remove(demo.size()-1);
                arr[i]=false;
            }
        }
    }
}
