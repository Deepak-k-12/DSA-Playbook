class Solution {
    public int longestBalanced(String s) {
        int length=s.length();
        int max_len=0;
        for(int i=0;i<length;i++){
            int freq[]=new int[26];
            for(int j=i;j<length;j++){
                char ch=s.charAt(j);
                freq[ch-'a']+=1;
                if(check(freq)){
                    max_len=Math.max(max_len,j-i+1);
                }
            }
        }
        return max_len;
    }

    public boolean check(int []freq){
        int ch_freq=0;
        for(int i:freq){
            if(i>0){
            if(ch_freq==0){
                ch_freq=i;
            }
            else{
                if(i!=ch_freq){return false;}
            }}
        }
        return true;
    }
}