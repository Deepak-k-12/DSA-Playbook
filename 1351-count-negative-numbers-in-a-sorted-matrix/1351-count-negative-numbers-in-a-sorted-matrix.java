class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            count+=check(i,grid);
        }
        return count;
    }

    public int check(int row,int [][]grid){
        int i=0;
        int j=grid[row].length-1;
        int ans = grid[row].length;
        while(i<=j){
            int mid=(i+j)/2;
            if(grid[row][mid]>=0){
                i=mid+1;
            }
            else{
                ans=mid;
                j=mid-1;
            }
        }
        return grid[row].length-ans;
    }
}