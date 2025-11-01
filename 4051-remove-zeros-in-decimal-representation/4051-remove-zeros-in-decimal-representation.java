class Solution {
    public long removeZeros(long n) {
        StringBuilder str=new StringBuilder();
        str.append(n);
        int i=0;
        int n1=str.length();
        while(i<n1){
            if(str.charAt(i)=='0'){
                str.deleteCharAt(i);
                n1--;
            }
            else{
            i++;}
    
        }
        long ans = Long.parseLong(str.toString());;  
        return ans;
    }
}