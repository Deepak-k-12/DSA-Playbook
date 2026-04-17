class Solution {
    public int numIslands(char[][] grid) {
        int [][]visit=new int[grid.length][grid[0].length];

        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visit[i][j]==0){
                    bfs(visit,i,j,grid);
                    c+=1;
                }
            }
        }
        return c;
    }

    public void bfs(int [][] visited,int i,int j,char [][] grid){
        Queue<int[]> q=new LinkedList<>();
        int temp1[]=new int[2];
        temp1[0]=i;
        temp1[1]=j;
        q.add(temp1);
        visited[i][j]=1;
        while(!q.isEmpty()){
            int temp[]=q.poll();
            i=temp[0];
            j=temp[1];

            if(i-1>=0 && grid[i-1][j]=='1' && visited[i-1][j]==0){
                 q.add(new int[]{i-1, j});
                visited[i-1][j]=1;
            }
            if(i+1<visited.length && grid[i+1][j]=='1' && visited[i+1][j]==0){
                 q.add(new int[]{i+1, j});
                visited[i+1][j]=1;
            }
            if(j-1>=0 && grid[i][j-1]=='1' && visited[i][j-1]==0){
                 q.add(new int[]{i, j-1});
                visited[i][j-1]=1;
            }
            if(j+1<visited[0].length && grid[i][j+1]=='1' && visited[i][j+1]==0){
                q.add(new int[]{i, j+1});
                visited[i][j+1]=1;
            }
            // if(i-1>=0 && j-1>=0 && grid[i-1][j-1]=='1' && visited[i-1][j-1]==0){
            //     temp[0]=i-1;
            //     temp[1]=j-1;
            //     q.add(temp);
            //     visited[i-1][j-1]=1;
            // }
            // if(i+1<visited.length && j+1<visited[0].length && grid[i+1][j+1]=='1' && visited[i+1][j+1]==0){
            //     temp[0]=i+1;
            //     temp[1]=j+1;
            //     q.add(temp);
            //     visited[i+1][j+1]=1;
            // }
            // if(i+1<visited.length && j-1>=0 && grid[i+1][j-1]=='1' && visited[i+1][j-1]==0){
            //     temp[0]=i+1;
            //     temp[1]=j-1;
            //     q.add(temp);
            //     visited[i+1][j-1]=1;
            // }
            // if(i-1>=0 && j+1<visited[0].length && grid[i-1][j+1]=='1' && visited[i-1][j+1]==0){
            //     temp[0]=i-1;
            //     temp[1]=j+1;
            //     q.add(temp);
            //     visited[i-1][j+1]=1;
            // }
            
        }
    }
}