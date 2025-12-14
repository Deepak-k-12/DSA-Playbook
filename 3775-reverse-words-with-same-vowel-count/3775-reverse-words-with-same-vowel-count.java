class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        int n=check(str[0]);
        StringBuilder ans=new StringBuilder();
        ans.append(str[0]+" ");
        for(int i=1;i<str.length;i++){
            int c=check(str[i]);
            if(c==n){
                ans.append(new StringBuilder(str[i]).reverse());
            }
            else{
                ans.append(str[i]);
            }
            ans.append(" ");
        }
        return ans.toString().trim();
    }

    public int check(String str){
        int c1=0;
        for(char c:str.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                c1+=1;
            }
        }
        return c1;
    }
}