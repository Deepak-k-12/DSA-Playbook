class Solution {
    public long sumAndMultiply(int n) {
        long a=0;
        int b=0;
        String str=n+"";
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                ans.append(str.charAt(i));
                b+=str.charAt(i)-'0';
            }
        }
        if (ans.length() == 0) return 0; 
        a=Long.parseLong(ans.toString())*b;
        return a;        
    }
}