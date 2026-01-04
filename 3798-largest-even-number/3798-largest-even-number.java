class Solution {
    public String largestEven(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(s.charAt(s.length()-1)!='1'){return s;}
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                c+=1;
            }
            else{break;}
        }
        return s.substring(0,s.length()-c);
    }
}