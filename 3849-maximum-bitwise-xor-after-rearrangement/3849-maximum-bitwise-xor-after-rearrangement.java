class Solution {
    public String maximumXor(String s, String t) {
        StringBuilder sb=new StringBuilder();
        int one=0;
        int zero=0;
        for(char ch:t.toCharArray()){
            if(ch=='0'){
                zero+=1;
            }
            else{one+=1;}
        }
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                if(one!=0){
                    sb.append(1+"");
                    one-=1;
                }
                else{
                    sb.append(0+"");
                    zero-=1;
                }
            }
            else{
                if(zero!=0){
                    sb.append(1+"");
                    zero-=1;
                }
                else{
                    sb.append(0+"");
                    one-=1;
                }
            }
        }
        return sb.toString();
    }
}