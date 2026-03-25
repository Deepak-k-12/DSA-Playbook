class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long row[]=new long[grid.length];
        long col[]=new long[grid[0].length];

        long sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                row[i]+=grid[i][j];
                col[j]+=grid[i][j];
                sum+=grid[i][j];                
            }
        }
        if(sum%2!=0) return false;
        return (partition(row,sum/2) || (partition(col,sum/2)));
    }

    public boolean partition(long arr[],long t){
        long sum=0;
        for(long i:arr){
            sum+=i;
            if(sum==t) return true;
            else if(sum>t) return false;
        }
        return false;
    }
}