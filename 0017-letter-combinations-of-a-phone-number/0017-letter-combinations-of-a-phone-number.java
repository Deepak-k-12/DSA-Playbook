class Solution {
    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] map = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> ans = new ArrayList<>();
        backtrack(0, digits, new StringBuilder(), ans, map);
        return ans;
    }

    private void backtrack(int idx, String digits,
            StringBuilder sb,
            List<String> ans,
            String[] map) {

        if (idx == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            backtrack(idx + 1, digits, sb, ans, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
