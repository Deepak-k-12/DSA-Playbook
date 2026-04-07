class Solution {
    StringBuilder sb=new StringBuilder();
    public String originalDigits(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']+=1;
        }
        step("zero",freq,0);
        step("two",freq,2);
        step("four",freq,4);
        step("six",freq,6);
        step("eight",freq,8);

        step("three",freq,3);
        step("five",freq,5);
        step("seven",freq,7);

        step("one",freq,1);
        step("nine",freq,9);
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static boolean valid(String str,int fre[]){
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(fre[idx]==0) return false;
        }
        return true;
    }

    public void update(String str,int fre[]){
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            fre[idx]-=1;
        }
    }

    public void step(String str, int []freq, int i){
        while(valid(str, freq)){
            update(str, freq);
            sb.append(i);
        }
    }
}