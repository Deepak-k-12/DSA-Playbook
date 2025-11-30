class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){return false;}
        int i=0,j=0;
        int s_len=s.length();
        int t_len=t.length();
        while(i<s_len && j<t_len){
            char ch=s.charAt(i);
            while(j<t_len && ch!=t.charAt(j)){
                j++;   
            }
            if(j==t_len && i!=s_len){return false;}
            i++;
            j++;
        }
        return i==s_len;
    }
}