class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        for(int i=0;i<nums1.length;i++){
        Arrays.fill(dp[i],Integer.MIN_VALUE / 2);} 
        return backtrack(0,0,nums1,nums2,dp);
    }

    public int backtrack(int i,int j,int nums1[],int nums2[],int [][] dp){
        if(i>=nums1.length || j>=nums2.length){return Integer.MIN_VALUE / 2;}
        if(dp[i][j]!=Integer.MIN_VALUE/2){return dp[i][j];}
        int st=nums1[i]*nums2[j];
        int in=st+backtrack(i+1,j+1,nums1,nums2,dp);
        int skip1=backtrack(i+1,j,nums1,nums2,dp);
        int skip2=backtrack(i,j+1,nums1,nums2,dp);

        dp[i][j]= Math.max(st,Math.max(in,Math.max(skip1,skip2)));
        return dp[i][j];
    }
}