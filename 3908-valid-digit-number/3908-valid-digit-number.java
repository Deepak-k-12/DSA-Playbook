class Solution {
    public boolean validDigit(int n, int x) {
        String str=n+"";
        if(str.length()==0 || str.charAt(0)==(x+'0')){
            return false;
        }
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==(x+'0')) return true;
        }
        return false;
    }
}