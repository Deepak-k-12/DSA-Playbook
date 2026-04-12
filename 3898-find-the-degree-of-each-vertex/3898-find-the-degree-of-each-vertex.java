class Solution {
    public int[] findDegrees(int[][] matrix) {
        int ans[]=new int [matrix.length];
        int j=0;
        for(int arr[]:matrix){
            for(int i:arr){
                if(i==1) {ans[j]+=1;}
            }
            j+=1;
        }
        return ans;
    }
}