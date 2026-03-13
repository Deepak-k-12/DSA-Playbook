class Solution {
    public int maxVowels(String s, int k) {
        String d="aeiou";
        int c=0;
        int max=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(d.indexOf(s.charAt(i))!=-1){
                c+=1;
            }
            if(i>=k){
                if(d.indexOf(s.charAt(j))!=-1){
                    c-=1;
                }
                j+=1;
            }
            max=Math.max(c,max);

        }

        if(max>=k){return k;}
        return max;
    
    }
}