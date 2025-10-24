class Solution {
    public boolean hasSameDigits(String s) {
        if(s.length()<2){return false;}
        StringBuilder str=new StringBuilder(s);
        return check(str);
    }

    public boolean check(StringBuilder str){
        if(str.length()==2){
            if(str.charAt(0)==str.charAt(1)){return true;}
            else{return false;}
        }
        StringBuilder demo=new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            int a=str.charAt(i)-'0';
            int b=str.charAt(i+1)-'0';
            demo.append((a+b)%10);
        }
        return check(demo);
    }
}