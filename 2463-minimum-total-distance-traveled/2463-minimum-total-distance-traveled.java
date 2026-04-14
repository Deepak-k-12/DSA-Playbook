class Solution {
    int arr[][];
    List<Integer> robo;
    long dp[][][];
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
      
        Collections.sort(robot);
        Arrays.sort(factory,(a,b)->{
          return a[0]-b[0];
        });
        arr=factory;
        robo =robot;
        dp=new long[robot.size()][factory.length][robot.size()+1];
        for(long i[][]:dp){
            for(long j[]:i){
                Arrays.fill(j,Long.MAX_VALUE/2);
            }
        } 

        return backtrack(0,0,factory[0][1]);
    }
  public long backtrack(int i, int fact, int limit) {
    if (i == robo.size()) return 0;
    long take = Long.MAX_VALUE / 2;
    if(dp[i][fact][limit]!=take){
        return dp[i][fact][limit];
    }
    if (limit > 0) {
        take = Math.abs(robo.get(i) - arr[fact][0]) +
               backtrack(i + 1, fact, limit - 1);
    }

    long skip = Long.MAX_VALUE / 2;
    if (fact + 1 < arr.length) {
        skip = backtrack(i, fact + 1, arr[fact + 1][1]);
    }

    return dp[i][fact][limit]=Math.min(take, skip);
}
}