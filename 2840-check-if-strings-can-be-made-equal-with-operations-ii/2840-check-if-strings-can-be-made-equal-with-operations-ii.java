class Solution {
    public boolean checkStrings(String s1, String s2) {
        int freq1[]=new int [26];
        int freq2[]=new int [26];
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(i%2==0){
            freq1[ch1-'a']++;
            freq1[ch2-'a']-=1;
            }
            else{
            freq2[ch1-'a']++;
            freq2[ch2-'a']-=1;
            }
        }
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            if(freq1[ch1-'a']!=0 || freq2[ch1-'a']!=0){
                return false;
            }
        }
        return true;
    }
}