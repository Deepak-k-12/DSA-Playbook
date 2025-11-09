class Solution {
    public int minimumDistance(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int a=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        m=Math.min(a,m);
                    }
                }
            }
        }
        return m==Integer.MAX_VALUE?-1:m;
    }
}