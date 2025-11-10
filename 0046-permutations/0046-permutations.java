class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        boolean arr[]=new boolean[nums.length];
        check(nums,arr,ans,new ArrayList<>());
        return ans;
    }

    public void check(int[] nums,boolean arr[],List<List<Integer>> ans,ArrayList<Integer> demo){
        if(demo.size()==nums.length){
            ans.add(new ArrayList<>(demo));
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