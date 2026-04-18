class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;

        int dir[][]={
            {-1,-1}, {-1,0}, {-1,1},{0,-1},{0,1},{1,-1},  {1,0},  {1,1}
        };
        q.add(new int[]{0,0,1});

        grid[0][0]=1;

        while(!q.isEmpty()){
            int temp[]=q.poll();
            int row1=temp[0];
            int col1=temp[1];
            int dist=temp[2];

            if(row1==n-1 && col1==n-1) return dist;
            
            for(int i[]:dir){
                int row=row1+i[0];
                int col=col1+i[1];

                if(row>=0 && col>=0 && row<n && col<n && grid[row][col]==0){
                    grid[row][col]=1;
                    q.add(new int[]{row,col,dist+1});
                }
            }

        }
        return -1;
        
    }
}