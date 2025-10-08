class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(a<t.length()){
                char ch1=t.charAt(a);
                if(ch1==ch){
                    c++;
                    a++;
                    break;
                    
                }
                a++;
            }
            if(a==t.length() && c!=s.length()){return false;}
        }
        return c==s.length();
    }
}