class Solution {
    int count=0;

    public class Pair{
        int x;
        int y;
        int z;

        Pair(int x,int y,int z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
        
    }

    public int orangesRotting(int[][] grid) {
        int visited[][]=new int [grid.length][grid[0].length];
        Queue<Pair> q=new LinkedList<>();
        int c=0;
        int row=0;
        int col=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) c+=1;
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
                visited[i][j]=grid[i][j];
            }
        }

        int ans=bfs(grid,visited,q);
        if(c==count) return ans;
        return -1;

    }

    public int bfs(int grid[][],int visited[][],Queue<Pair> q){

        int max=0;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int i=p.x;
            int j=p.y;
            int c=p.z;
            max=Math.max(max,c);

            if(i-1>=0 && grid[i-1][j]==1 && visited[i-1][j]==1){
                visited[i-1][j]=2;
                q.add(new Pair(i-1,j,c+1));
                count+=1;
            }
            if(i+1<visited.length && grid[i+1][j]==1 && visited[i+1][j]==1){
                visited[i+1][j]=2;
                q.add(new Pair(i+1,j,c+1));
                count+=1;
            }
            if(j-1>=0 && grid[i][j-1]==1 && visited[i][j-1]==1){
                visited[i][j-1]=2;
                q.add(new Pair(i,j-1,c+1));
                count+=1;
            }
             if(j+1<visited[0].length && grid[i][j+1]==1 && visited[i][j+1]==1){
                visited[i][j+1]=2;
                q.add(new Pair(i,j+1,c+1));
                count+=1;
            }
        }
        return max;
        
    }


}