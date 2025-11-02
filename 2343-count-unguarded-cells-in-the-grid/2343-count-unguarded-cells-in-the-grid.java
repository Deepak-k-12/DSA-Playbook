class Solution {
    
    int count=0;
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) { 
        
        int cell [][]=new int [m][n];
        for(int i[]:guards){
            cell[i[0]][i[1]]=2;
        }
        for(int i[]:walls){
            cell[i[0]][i[1]]=2;
        }
        for(int i[]:guards){
            check_up(i[0],i[1],cell);
            check_down(i[0],i[1],cell);
            check_right(i[0],i[1],cell);
            check_left(i[0],i[1],cell);
        }
        return (m*n)-count-guards.length-walls.length;

    }
    public void check_down(int x,int y,int [][]cell){
        for(int i=x+1;i<cell.length;i++){
            if(cell[i][y]==2){break;}
            if(cell[i][y]==0){
            cell[i][y]=1;
            count++;
            }
        }
    }
    public void check_up(int x,int y,int [][]cell){
        for(int i=x-1;i>=0;i--){
            if(cell[i][y]==2){break;}
            if(cell[i][y]==0){
            cell[i][y]=1;
            count++;
            }
        }
    }
    public void check_right(int x,int y,int [][]cell){
        for(int i=y+1;i<cell[0].length;i++){
            if(cell[x][i]==2){break;}
            if(cell[x][i]==0){
            cell[x][i]=1;
            count++;
            }
        }
    }
    public void check_left(int x,int y,int [][]cell){
        for(int i=y-1;i>=0;i--){
           if(cell[x][i]==2){break;}
            if(cell[x][i]==0){
            cell[x][i]=1;
            count++;
            }
        }
    }

}