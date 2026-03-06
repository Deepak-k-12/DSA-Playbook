class Solution {
    public int minOperations(String s) {
        return Math.min(check(s,'1'),check(s,'0'));
    }

    public int check(String str,char ch){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                count+=1;
            }
            if(ch=='0'){ch='1';}
                else{ch='0';}
        }
        return count;
    }
}