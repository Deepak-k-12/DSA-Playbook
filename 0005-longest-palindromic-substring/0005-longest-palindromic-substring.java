class Solution {
    public String longestPalindrome(String s) {
        String s1=new StringBuilder(s).reverse().toString();
        StringBuilder sb=new StringBuilder();
        int dp[][]=new int [s.length()+1][s.length()+1];

        int max=0;
        int r=0,c=0;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }

                int startind=i-dp[i][j];
                int revind=s.length()-j;
                if(startind==revind && max<dp[i][j]){
                    max=dp[i][j];
                    r=i;
                    c=j;
                }
            }
        }
        int i=r;
        int j=c;

        while(i>0 && j>0 && dp[i][j]!=0){
            if(s.charAt(i-1) ==s1.charAt(j-1)){
                sb.insert(0,s.charAt(i-1)+"");
                i--;
                j--;
            }
        }
        return sb.toString();
    }
}