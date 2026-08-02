class Solution {
    Integer[][] dp;
    public boolean stoneGame(int[] piles) {
        dp=new Integer[piles.length][piles.length];
        return backtrack(piles,0,piles.length-1)>=1;
    }

    public int backtrack(int piles[],int st,int ed){
        if(st==ed){
            return piles[st];
        }
        if(dp[st][ed]!=null) return dp[st][ed];

        int take_l=piles[st]-backtrack(piles,st+1,ed);
        int take_r=piles[ed]-backtrack(piles,st,ed-1);

        return dp[st][ed]= Math.max(take_l,take_r);
    }
}