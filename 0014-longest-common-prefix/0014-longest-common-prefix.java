class Solution {
    public String longestCommonPrefix(String[] str) {
        String a=str[0];
        StringBuilder sb=new StringBuilder();
        int i=0;
        boolean check=true;
        while(i<a.length()){
            check=true;
            for(int j=1;j<str.length;j++){
                if (str[j].length()<=i||a.charAt(i) != str[j].charAt(i)){
                    check=false;
                }
            }
            if(check){sb.append(a.charAt(i));}
            else{return sb.toString();}
            i++;
        }
        return sb.toString();
    }
}