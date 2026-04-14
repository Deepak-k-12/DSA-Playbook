class Solution {

    int mod=1000000007;
    int types[][];
    int dp[][][];

    public int waysToReachTarget(int target, int[][] type) {

        types=type;
        dp=new int[types.length][1001][51];

        for(int i[][]:dp){
            for(int j[]:i){
                Arrays.fill(j,-1);
            }
        }
        return backtrack(0,target,type[0][0],type[0][1]);
    }

    public int backtrack(int in,int t,int limit,int mark){
        if(t==0) return 1;
        if(in>=types.length) return 0;
        if(dp[in][t][limit]!=-1) return dp[in][t][limit];

        int take=0;
        if(limit>0 && (t>=mark)){
            take=(take+backtrack(in,t-mark,limit-1,mark))%mod;
        }

        if((in+1)<types.length){
            take=(take+backtrack(in+1,t,types[in+1][0],types[in+1][1]))%mod;
        }   

        return dp[in][t][limit]=take%mod;

    }
}