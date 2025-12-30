class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        
        for(int i=0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){
                if(check(i,j,m,n,grid)){
                    count+=1;
                }
            }
        }
        return count;
    }

    public boolean check(int row,int col,int m,int n,int[][] grid){
        

         boolean[] seen = new boolean[10];

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = grid[row + i][col + j];
                if (val < 1 || val > 9 || seen[val]) return false;
                seen[val] = true;
            }
        }

        for(int i=0;i<3;i++){
            if(grid[row+i][col+0]+grid[row+i][col+1]+grid[row+i][col+2]!=15){return false;}
        }

        for(int i=0;i<3;i++){
             if (grid[row][col + i] +
                grid[row + 1][col + i] +
                grid[row + 2][col + i] != 15)
                return false;
        }

        if(grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2]!=15){return false;}
        if(grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col]!=15){return false;}
        return true;
    }
}