class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int i=0;
        int j=0;
        int start=0;
        while(j<goal.length()){
            
            if(i==s.length()){
                i=0;
            }
            
            char ch1=s.charAt(i);
            char ch2=goal.charAt(j);
            if(ch1==ch2){
                i+=1;
                j+=1;
            }
            else{
                start+=1;
                if (start >= s.length()) break;
                i=start;
                j=0;
                
            }
            
        }
        return j==goal.length();
    }
}