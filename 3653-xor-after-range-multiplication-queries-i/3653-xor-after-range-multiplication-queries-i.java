class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums) arr.add(i);

        for(int i[]:queries){
            int l=i[0];
            int r=i[1];
            int k=i[2];
            int v=i[3];
            int idx=l;
            while(idx<=r && idx<nums.length){
                long val=((long)arr.get(idx)*v)%1000000007;
                arr.set(idx,(int)val);
                idx+=k;
            }
        }
        long ans=0;
        for(int i:arr){
            ans=ans^i;
        }
        return (int)ans;
    }
}