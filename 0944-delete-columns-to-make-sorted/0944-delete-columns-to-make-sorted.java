class Solution {
    public int minDeletionSize(String[] str) {
    int c=0;
      for(int i=0;i<str[0].length();i++){
        int a=str[0].charAt(i)-'a';
        for(int j=1;j<str.length;j++){
            int b=str[j].charAt(i)-'a';
            if(a<=b){
                a=b;
            }
            else{
                c+=1;
                break;
            }
        }
      }
      return c;  
    }
}