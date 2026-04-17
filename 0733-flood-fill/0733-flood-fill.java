class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int ans[][]=new int[image.length][image[0].length];
       for(int i=0;i<image.length;i++){
        for(int j=0;j<image[0].length;j++){
            ans[i][j]=image[i][j];
        }
       }
       int dir1[]={-1,0,+1,0};
       int dir2[]={0,+1,0,-1};
       int t=image[sr][sc];
       dfs(sr,sc,color,ans,t,dir1,dir2);
       return ans;
    }

    public void dfs(int i,int j,int color,int[][]ans,int t,int[]dir1,int[]dir2){
        
        ans[i][j]=color;

        for(int a=0;a<4;a++){
            int row=i+dir1[a];
            int col=j+dir2[a];

            if(row>=0 && row<ans.length && col>=0 && col<ans[0].length && ans[row][col]==t && ans[row][col]!=color){
                dfs(row,col,color,ans,t,dir1,dir2);
            }
        }

    }
}