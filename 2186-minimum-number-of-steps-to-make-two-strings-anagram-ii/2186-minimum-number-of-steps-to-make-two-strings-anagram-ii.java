class Solution {
    public int minSteps(String s, String t) {
        int []freq=new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']-=1;
        }
        int sum=0;
        for(int i:freq){
            sum+=Math.abs(i);
        }
        return sum;
    }
}