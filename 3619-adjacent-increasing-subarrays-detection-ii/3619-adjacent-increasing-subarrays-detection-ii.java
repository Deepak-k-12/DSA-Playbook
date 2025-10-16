class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        
        int pre[]=new int[nums.size()];

        calculate_pre(pre,nums);

        int i=0,j=nums.size()/2,ans=0;
        while(i<=j){
            int k=(i+j)/2;
            if(check(nums,pre,k)){
                ans=Math.max(ans,k);
                i=k+1;
            }
            else{j=k-1;}
        }
        return ans;

    }

    public void calculate_pre(int []pre,List<Integer> nums){
        pre[0]=1;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i-1)<nums.get(i)){
                pre[i]=pre[i]+pre[i-1]+1;
            }
            else{pre[i]=1;}
        }
    }

    public boolean check(List<Integer> nums,int []pre,int k){
        int n=nums.size();
        for(int i=n-1;i-k>=0;i--){
            if(pre[i]>=k && pre[i-k]>=k){
                return true;
            }         
        }
        return false;
    }
}