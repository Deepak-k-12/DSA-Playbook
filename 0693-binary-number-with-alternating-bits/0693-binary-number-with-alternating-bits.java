class Solution {
    public boolean hasAlternatingBits(int n) {
        int num=n;
        boolean check=false;
        int prev=-1;
        while(num>0){
            int curr=num%2;
            if(prev==-1 || prev!=curr){
                num=num/2;
                prev=curr;
            }
            else{return false;}
        }
        return true;
    }
}