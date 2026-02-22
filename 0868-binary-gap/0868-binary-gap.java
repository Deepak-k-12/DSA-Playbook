class Solution {
    public int binaryGap(int n) {
       String input=Integer.toBinaryString(n);
       int prev=-1;
       int max=0;
       for(int i=0;i<input.length();i++){
          char ch=input.charAt(i);
          if(ch=='1'){
            if(prev==-1){
                prev=i;
                continue;
            }
            max=Math.max(max,i-prev);
            prev=i;
          }
       }
       
       
       return max; 
    }
}