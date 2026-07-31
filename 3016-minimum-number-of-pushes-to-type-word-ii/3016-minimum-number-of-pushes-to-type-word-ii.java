class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int [26];

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            freq[ch-'a']+=1;
        }

        Arrays.sort(freq);
        int count=0;
        int c=1;
        int c1=0;

        for(int i=25;i>=0;i--){
            count+=(c*freq[i]);
            c1+=1;
            if(c1==8){
                c+=1;
                c1=0;
            }
        }
        return count;
    }
}