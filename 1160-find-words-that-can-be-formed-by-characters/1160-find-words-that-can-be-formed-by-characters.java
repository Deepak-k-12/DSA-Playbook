class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[]=new int[26];
        for(int i=0;i<chars.length();i++){
            char ch=chars.charAt(i);
            freq[ch-'a']+=1;
        }
        int count=0;
        for(String str:words){
            boolean check=true;
            int temp[] = freq.clone();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(temp[ch-'a']==0){
                    check=false;
                    break;
                }
                temp[ch-'a']-=1;

            }
            if(check){
                count+=str.length();
            }
        }
        return count;
    }
}