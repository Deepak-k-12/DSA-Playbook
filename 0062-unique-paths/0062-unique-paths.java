class Solution {
    public int uniquePaths(int m, int n) {
        int dp[]=new int[n];
       
        for(int i=0;i<m;i++){
            int temp[]=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){temp[j]=1;}
                else{
                    int up=0;
                    int left=0;
                    if(i>0){up=dp[j];}
                    if(j>0){left=temp[j-1];}
                    temp[j]=up+left;
                }
            }
            dp=temp;
        }
        return dp[n-1];
    }

    public int backtrack(int i,int j,int [][] dp){
        if(i==0 && j==0){return 1;}
        if(i<0 || j<0){return 0;}

        if(dp[i][j]!=-1){return dp[i][j];}

        int left=backtrack(i,j-1,dp);
        int right=backtrack(i-1,j,dp);
        dp[i][j]=left+right;
        
        return dp[i][j];
        
    }
}