class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int dp[][]=new int [s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return backtrack(s1.length()-1,s2.length()-1,s1,s2,dp);
    }

    public int backtrack(int i1,int j1,String s1, String s2,int [][]dp){
        
        

        if(i1<0){
            int sum=0;
            for(int i=j1;i>=0;i--){
                sum+=s2.charAt(i);
            }
            return sum;
        }
         if(j1<0){
            int sum=0;
            for(int i=i1;i>=0;i--){
                sum+=s1.charAt(i);
            }
            return sum;
        }
        if(dp[i1][j1]!=-1){return dp[i1][j1];}
        if(s1.charAt(i1)==s2.charAt(j1)){return backtrack(i1-1,j1-1,s1,s2,dp);}

        dp[i1][j1] =Math.min(s1.charAt(i1)+backtrack(i1-1,j1,s1,s2,dp),s2.charAt(j1)+backtrack  (i1,j1-1,s1,s2,dp));

        return dp[i1][j1];

    }
}