class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int c1=0,c2=0,c3=0,c4=0;
        int n=mat.length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==target[j][n-i]){
                    c1+=1;
                } 
                if(mat[i][j]==target[i][j]){
                    c2+=1;
                }
                if(mat[i][j]==target[n-i][n-j]){
                    c3+=1;
                }
                if(mat[i][j]==target[n-j][i]){
                    c4+=1;
                }
            }
        }
        int len=mat.length*mat[0].length;
        return (c1==len) || (c2==len) || (c3==len) || (c4==len);
    }
}