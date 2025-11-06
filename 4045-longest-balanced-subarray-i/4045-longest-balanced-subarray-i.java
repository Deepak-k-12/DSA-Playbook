class Solution{
    public int longestBalanced(int[] nums){
        int n=nums.length,ans=0;
        for(int i=0;i<n;i++){
            Set<Integer> s=new HashSet<>();
            int e=0,o=0;
            for(int j=i;j<n;j++){
                int x=nums[j];
                if(!s.contains(x)){
                    s.add(x);
                    if(x%2==0)e++;else o++;
                }
                if(e==o)ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}
