class Solution {

    public int [][] get(int[][] grid, int x, int y, int k){
            int l=x;
            int h=x+k-1;
            while(l<h){
            for(int j=y;j<=k+y-1;j++){
                int temp=grid[l][j];
                grid[l][j]=grid[h][j];
                grid[h][j]=temp;
            }
            l++;
            h--;
        }
        return grid;
    }

    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        return get (grid,x,y,k);
    }
}