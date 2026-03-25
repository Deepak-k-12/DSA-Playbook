class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int col[]=new int[grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            int sum=0;
            for(int j=0;j<grid[0].length;j++){
                if(i==0){
                    col[j]=grid[i][j];
                    sum+=col[j];
                    if(sum<=k) count+=1;
                }
                else{
                    col[j]+=grid[i][j];
                    sum+=col[j];
                    if(sum<=k) count+=1;
                    else break;
                }
            }
        }
        return count;
    }
}