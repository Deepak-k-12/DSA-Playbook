class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];

        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return backtrack(text1.length()-1,text2.length()-1,text1,text2,dp);
    }

    public int backtrack(int in1,int in2,String s1,String s2,int[][] dp){
        if(in1<0 || in2<0){
            return 0;
        }

        if(dp[in1][in2]!=-1){return dp[in1][in2];}

        if(s1.charAt(in1)==s2.charAt(in2)){
            return 1+backtrack(in1-1,in2-1,s1,s2,dp);
        }

        int skip1=backtrack(in1-1,in2,s1,s2,dp);
        int skip2=backtrack(in1,in2-1,s1,s2,dp);

        return dp[in1][in2]=Math.max(skip1,skip2);
    }


}