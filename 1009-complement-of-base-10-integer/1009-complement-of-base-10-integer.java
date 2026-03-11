class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        return calculate(n);
    }

    public int calculate(int n){
        int pow=1;
        int sum=0;
        while(n>0){
            if(n%2==0){
                sum+=pow;
            }
            n=n/2;
            pow=pow*2;
        }
        return sum;
    }
}