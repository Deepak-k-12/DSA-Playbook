class Solution {
    public char findKthBit(int n, int k) {
        
       StringBuilder a=new StringBuilder();
       a.append('0');
        while(n>=1){

            StringBuilder sb=new StringBuilder();

            for(int i=a.length()-1;i>=0;i--){
                char ch=a.charAt(i);
                if(ch=='1'){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
            }
            n-=1;
            a.append("1"+sb.toString());

    }

    return a.charAt(k-1);

    }
}