class Solution {
    public int longestPalindromeSubseq(String s) {
        String s1=new StringBuilder(s).reverse().toString();
        StringBuilder sb=new StringBuilder();
        int dp[][]=new int [s.length()+1][s.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[s.length()][s.length()];
        // int i=s.length();
        // int j=s.length();

        // while(i>0 && j>0){
        //     if(s.charAt(i-1) ==s1.charAt(j-1)){
        //         sb.insert(0,s.charAt(i-1)+"");
        //         i--;
        //         j--;
        //     }
        //     else if(dp[i-1][j]>dp[i][j-1]){
        //         i--;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        // return sb.toString();
    }
}