class Solution {
    int dp[][];
    String s1;
    String s2;
    public int minDistance(String word1, String word2) {
        s1=word1;
        s2=word2;
        dp=new int[word1.length()+1][word2.length()+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return backtrack(word1.length(),word2.length());
    }

    public int backtrack(int i,int j){
        if(i==0) return j;
        if(j==0) return i;

        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1)) return backtrack(i-1,j-1);
        
        int insert=1+backtrack(i,j-1);
        int delete=1+backtrack(i-1,j);
        int replace=1+backtrack(i-1,j-1);

        return dp[i][j]= Math.min(insert,Math.min(delete,replace));
    }
}