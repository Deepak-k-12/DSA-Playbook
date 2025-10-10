class Solution {
    public int maximumEnergy(int[] energy, int k) {
       int m=Integer.MIN_VALUE;
       int n=energy.length;
       int suff[]=new int[n];
       
       for(int i=n-1;i>=0;i--){
        if(i+k<n){
            suff[i]=energy[i]+suff[i+k];
        }
        else{
            suff[i]=energy[i];
        }
        m=Math.max(m,suff[i]);
       }
       return m;
       
    }
}