class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder(s);
        check(0,sb,ans);
        return ans;
    }

    public void check(int ind, StringBuilder sb, List<String> ans) {
        if (ind == sb.length()) {
            ans.add(sb.toString());
            return;
        }
        char ch = sb.charAt(ind);
        char ch1;
        check(ind + 1, sb, ans);
        if (Character.isLetter(ch)) {
            
            if (Character.isLowerCase(ch)) {
                ch1 = Character.toUpperCase(ch);
            } else {
                ch1 = Character.toLowerCase(ch);
            }
            sb.setCharAt(ind,ch1);
            check(ind+1,sb,ans);
            sb.setCharAt(ind,ch);
        } else {
            return;
        }

    }
}