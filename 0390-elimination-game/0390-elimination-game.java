class Solution {
    public int lastRemaining(int n) {
        boolean dir=true;
        int s=1;
        int rem=n;
        int curr=1;
        while(rem>1){
            if(dir || rem%2==1){
                curr+=s;
            }
            s*=2;
            rem/=2;
            dir=!dir;
        }
        return curr;
    }
}