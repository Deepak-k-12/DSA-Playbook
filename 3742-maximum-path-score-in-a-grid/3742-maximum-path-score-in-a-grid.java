class Solution {
    public int maxPathScore(int[][] grid, int k) {
        return backtrack(0,0,grid,k,0,0);
    }

    public int backtrack(int row,int col,int[][] grid,int k,int s,int c){
        if(c>k){
            return -1;
        }
        if(row>=grid.length || col>=grid[0].length) return -1;
    
        int cost=0;
        if(grid[row][col]==1 || grid[row][col]==2){
            cost=1;
        }

         if(row==grid.length-1 && col==grid[0].length-1){
            if((c+cost)>k) return -1;
            return s+grid[row][col];
        }
        int right=backtrack(row,col+1,grid,k,s+grid[row][col],c+cost);
        int down=backtrack(row+1,col,grid,k,s+grid[row][col],c+cost);

        return Math.max(right,down);
    }
}