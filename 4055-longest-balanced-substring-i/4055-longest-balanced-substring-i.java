class Solution {
    public int longestBalanced(String s) {
        int length=s.length();
        int max_len=0;
        for(int i=0;i<length;i++){
            HashMap<Character,Integer> freq=new HashMap<>();
            for(int j=i;j<length;j++){
                char ch=s.charAt(j);
                freq.put(ch,freq.getOrDefault(ch,0)+1);
                if(check(freq)){
                    max_len=Math.max(max_len,j-i+1);
                }
            }
        }
        return max_len;
    }

    public boolean check(HashMap<Character,Integer> freq){
        int ch_freq=0;
        for(int i:freq.values()){
            if(ch_freq==0){
                ch_freq=i;
            }
            else{
                if(i!=ch_freq){return false;}
            }
        }
        return true;
    }
}