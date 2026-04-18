class Solution {
    public int minimumEffortPath(int[][] heights) {
        int differ[][]=new int [heights.length][heights[0].length];
        for(int i[]:differ){
            Arrays.fill(i,Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        q.add(new int[]{0,0,0});
        differ[0][0]=0;

        int[][] dir={
            {-1,0},{1,0},{0,-1},{0,1}
        };

        while(!q.isEmpty()){
            int temp[]=q.poll();
            int row=temp[1];
            int col=temp[2];
            int diff=temp[0];

            if(row==heights.length-1 && col==heights[0].length-1) return diff;

            for(int i[]:dir){
                int nr=row+i[0];
                int nc=col+i[1];


                if (nr >= 0 && nc >= 0 && nr < heights.length && nc < heights[0].length) {
                    int newDiff = Math.max(diff,
                        Math.abs(heights[nr][nc] - heights[row][col]));

                    if (newDiff < differ[nr][nc]) {
                        differ[nr][nc] = newDiff;
                        q.add(new int[]{newDiff, nr, nc});
                    }
            }
        }
    
    }

         return 0;
    }
}