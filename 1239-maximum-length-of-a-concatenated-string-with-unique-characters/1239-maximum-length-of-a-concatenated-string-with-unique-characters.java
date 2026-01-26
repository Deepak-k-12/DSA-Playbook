class Solution {
    public int maxLength(List<String> arr) {
        return backtrack(0,"",arr);
    }
    public int backtrack(int in,String str,List<String> arr){
        if(in==arr.size()){return str.length();}
        int pick=0;
        int notpick=0;

        if(valid(arr.get(in),str)){
            pick=backtrack(in+1,str+arr.get(in),arr);
        }
        notpick=backtrack(in+1,str,arr);
        return Math.max(pick,notpick);

    }

    public boolean valid(String s1,String s2){
        String combine=s1+s2;

        int freq[]=new int[26];
        for(char ch:combine.toCharArray()){
            if(freq[ch-'a']>0){
                return false;
            }
            freq[ch-'a']+=1;
        }
        return true;
    }
}