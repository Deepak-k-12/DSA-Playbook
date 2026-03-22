class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m1=grid.length-k+1;
        int n1=grid[0].length-k+1;
        int ans[][]=new int[m1][n1];
        for(int i=0;i<m1;i++){
            int g=0;
            for(int j=0;j<grid[0].length;j++){
                if(j+k>grid[0].length) break;
                ans[i][g++]=check(i,j,grid,k);
            }
        }
        return ans;
    }

    public int check(int r,int a,int [][]grid,int k){
        Set<Integer> set=new HashSet<>();
        for(int i=r;i<r+k;i++){
            for(int j=a;j<(a+k);j++){
               set.add(grid[i][j]);
            }
        }
        ArrayList<Integer> arr=new ArrayList<>(set);
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            min=Math.min(min,Math.abs(arr.get(i)-arr.get(i+1)));
        }
    return min==Integer.MAX_VALUE?0:min;
    }
}