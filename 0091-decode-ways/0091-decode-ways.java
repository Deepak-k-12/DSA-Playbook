class Solution {
    public int numDecodings(String s) {
        int dp[]=new int [s.length()];
        Arrays.fill(dp,-1);
        return backtrack(0,s,dp);
    }

    public int backtrack(int in,String s,int []dp){
        if(in>=s.length()){return 1;}

        if(s.charAt(in)=='0'){return 0;}
        if(dp[in]!=-1){return dp[in];}
        int ways=backtrack(in+1,s,dp);
        if(in+1<s.length()){
            int val = Integer.parseInt(s.substring(in, in + 2));
            if(val>0 && val<=26){
                ways+=backtrack(in+2,s,dp);
            }
        }
        return dp[in]=ways;
    }
}