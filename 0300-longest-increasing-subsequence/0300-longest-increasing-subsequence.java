class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> demo=new ArrayList<>();
        demo.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>demo.get(demo.size()-1)){
                demo.add(nums[i]);
            }
            else{
                binary(nums[i],demo);
            }
        }
        return demo.size();
    }

    public void binary(int a,List<Integer> demo){
        int i=0;
        int j=demo.size()-1;
        int ans=j;

        while(i<=j){
            int mid=(i+j)/2;
            if(demo.get(mid)>=a){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }

        demo.set(ans,a);
    }
}