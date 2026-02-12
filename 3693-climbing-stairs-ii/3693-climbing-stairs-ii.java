class Solution {
    public int climbStairs(int n, int[] costs) {
        int []dp=new int [n+1];
        Arrays.fill(dp,-1);
        return backtrack(0,n,costs,dp);
    }

    public int backtrack(int i,int n,int[]costs,int []dp){
        if(i==n){return 0;}
        if (i > n) return Integer.MAX_VALUE/2;
        if(dp[i]!=-1){return dp[i];}
        
        int first=Integer.MAX_VALUE/2;
        int second=Integer.MAX_VALUE/2;
        int third=Integer.MAX_VALUE/2;

        if(i+1<=n){
            first= (i<costs.length?costs[i]:0) + 1*1 + backtrack(i+1,n,costs,dp);
            }
        if(i+2<=n){
            second= (i+1<costs.length?costs[i+1]:0) + 2*2 + backtrack(i+2,n,costs,dp);
        }
        if(i+3<=n){
            third= (i+2<costs.length?costs[i+2]:0) + 3*3 + backtrack(i+3,n,costs,dp);
        }

        return dp[i]=Math.min(first,Math.min(second,third));
    }
}