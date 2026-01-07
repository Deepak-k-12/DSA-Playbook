class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        int ind=tri.size()-1;
        int dp[][]=new int[ind+1][ind+1];

        for(int i=0;i<=ind;i++){
            dp[ind][i]=tri.get(ind).get(i);
        }

        for(int i=ind-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down=tri.get(i).get(j)+dp[i+1][j];
                int dg=tri.get(i).get(j)+dp[i+1][j+1];

                dp[i][j]=Math.min(down,dg);
            }
        }
        return dp[0][0];

        
        
      
    }

    public int backtrack(int i,int j,List<List<Integer>> tri,int ind,int [][]dp){
        if(i==ind ){
            return tri.get(i).get(j);}
        if(dp[i][j]!=Integer.MAX_VALUE){return dp[i][j];}
        int down=tri.get(i).get(j)+backtrack(i+1,j,tri,ind,dp);
        int side=tri.get(i).get(j)+backtrack(i+1,j+1,tri,ind,dp);
        dp[i][j]=Math.min(down,side);
        return dp[i][j];
    }
}