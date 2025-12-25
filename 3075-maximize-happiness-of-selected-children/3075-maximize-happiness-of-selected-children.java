class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        Arrays.sort(hap);
        int c=0;
        long dec=0;
        int i=hap.length-1;
        while(k>0){
            int val=(hap[i]-c)<=0?0:hap[i]-c;
            dec+=val;
            c+=1;
            i--;
            k--;
        }
        return dec;
    }
}