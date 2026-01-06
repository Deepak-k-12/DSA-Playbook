class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
         int m=ob.length;
         int n= ob[0].length;
         int dp[]=new int[n];
       
        for(int i=0;i<m;i++){
            int temp[]=new int[n];
            for(int j=0;j<n;j++){
                if(i>=0 && j>=0 && ob[i][j]==1){
                    temp[j]=0;
                    continue;
                }
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
}
