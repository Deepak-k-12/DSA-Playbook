class Solution {
    public int minDistance(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int [s1.length()+1][s2.length()+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        int longest=backtrack(s1.length()-1,s2.length()-1,s1,s2,dp);
        return (n-longest) + (m-longest);
    }

    public int backtrack(int in1,int in2,String s1,String s2,int[][]dp){
        if(in1<0 || in2<0){return 0;}
        if(dp[in1][in2]!=-1){return dp[in1][in2];}
        if(s1.charAt(in1)==s2.charAt(in2)){
            return dp[in1][in2]=1+backtrack(in1-1,in2-1,s1,s2,dp);
        }
        int skip1=backtrack(in1-1,in2,s1,s2,dp);
        int skip2=backtrack(in1,in2-1,s1,s2,dp);
        return dp[in1][in2]=Math.max(skip1,skip2);
    }
}