class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] let = new char[256];
        char[] let1 = new char[256];
        int s_len=s.length();
        int t_len=t.length();
        if(s_len!=t_len){return false;}
        int i=0,j=0;
        while(i<s_len){
            char ch1=s.charAt(i);
            char ch2=t.charAt(j);
            if(let[ch1]=='\u0000' && let1[ch2]=='\u0000'){
                let[ch1]=ch2;
                let1[ch2]=ch1;
            }
            else if(let[ch1]!=ch2 || let1[ch2]!=ch1){
               return false;
            }
           i++;
           j++;
        }
        return true;

    }
}