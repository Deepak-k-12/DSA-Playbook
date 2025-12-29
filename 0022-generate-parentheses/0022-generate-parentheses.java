class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backtrack(0,0,ans,sb,n);
        return ans;
    }

    public void backtrack(int open,int close,ArrayList<String> ans,StringBuilder sb,int n){
        if(open==n && close==n){
            ans.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            backtrack(open+1,close,ans,sb,n);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(')');
            backtrack(open,close+1,ans,sb,n);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}