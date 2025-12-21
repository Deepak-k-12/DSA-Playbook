class Solution {
    public int mirrorDistance(int n) {
        int r=reverse(n);
        return Math.abs(n-r);
    }

    public int reverse(int n){
        int c=0;
        while(n>0){
            c = c*10+(n % 10);
            n=n/10;
            
        }
        return c;
    }
}