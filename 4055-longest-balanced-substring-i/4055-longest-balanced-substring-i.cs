public class Solution {
    public int LongestBalanced(string s) {
        
        int length=s.Length;
        int max_len=0;
        for(int i=0;i<length;i++){
            int []freq=new int[26];
            for(int j=i;j<length;j++){
                char ch=s[j];
                freq[ch-'a']+=1;
                if(Check(freq)){
                    max_len=Math.Max(max_len,j-i+1);
                }
            }
        }
        return max_len;
    }

    public bool Check(int []freq){
        int ch_freq=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
            if(ch_freq==0){
                ch_freq=freq[i];
            }
            else{
                if(freq[i]!=ch_freq){return false;}
            }}
        }
        return true;
    }
}