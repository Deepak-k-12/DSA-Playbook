class Solution {
     int dp[];
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return backtrack(0,arr,k);
    }

    public int backtrack(int in,int arr[],int k){
        if(in==arr.length) return 0;

        if(dp[in]!=-1) return dp[in];
        int len=0;
        int sum=0;
        int max=0;
        int maxi=0;

        for(int i=in;i<Math.min(arr.length,in+k);i++){
            len++;
            max=Math.max(max,arr[i]);
            sum=(max*len)+backtrack(i+1,arr,k);
            maxi=Math.max(maxi,sum);
        }
        return dp[in]=maxi;
    }
}