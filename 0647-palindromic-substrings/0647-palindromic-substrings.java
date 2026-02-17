class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=palindrome(s,i,i);
            count+=palindrome(s,i,i+1);
        }
        return count;
    }

    public int palindrome(String s1,int left,int right){
        int count=0;
        while(left>=0 && right<s1.length() && s1.charAt(left)==s1.charAt(right)){
            count+=1;
            left--;
            right++;
        }
        return count;
    }
}