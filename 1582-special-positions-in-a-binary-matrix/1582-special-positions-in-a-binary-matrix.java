class Solution {
    public int numSpecial(int[][] mat) {

        int count =0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && check(i,j,mat)){
                    count+=1;
                }
            }
        }
        return count;
    }

    public boolean check(int a,int b,int[][]mat){

        for(int i=0;i<mat[0].length;i++){
            if(i==b){continue;}
            if(mat[a][i]==1){return false;}
        }
        for(int i=0;i<mat.length;i++){
            if(i==a){continue;}
            if(mat[i][b]==1){return false;}
        }
        return true;
    }
}