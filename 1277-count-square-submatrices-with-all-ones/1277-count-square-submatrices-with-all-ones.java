class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]!=0){
                    count+=backtrack(i,j,matrix);
                }
            }
        }
        return count;
    }

    public int backtrack(int i,int j,int[][] matrix){
        int count=0;
        int size=Math.min(matrix.length - i, matrix[0].length - j);
        for(int i1=1;i1<=size;i1++){
            if(valid(i,j,i1,matrix)){
                count+=1;
            }
            else{break;}
        }
        return count;
    }

    public boolean valid(int i,int j,int c,int [][] matrix){

        for(int a=0;a<c;a++){
            for(int b=0;b<c;b++){
                if(matrix[i+a][j+b]!=1){return false;}
            }
        }
        return true;
    }
}