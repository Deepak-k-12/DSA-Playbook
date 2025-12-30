class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
             return new ArrayList<>();
            }
      HashMap<Character, List<Character>> demo = new HashMap<>();

        demo.put('2', Arrays.asList('a', 'b', 'c'));
        demo.put('3', Arrays.asList('d', 'e', 'f'));
        demo.put('4', Arrays.asList('g', 'h', 'i'));
        demo.put('5', Arrays.asList('j', 'k', 'l'));
        demo.put('6', Arrays.asList('m', 'n', 'o'));
        demo.put('7', Arrays.asList('p', 'q', 'r', 's'));
        demo.put('8', Arrays.asList('t', 'u', 'v'));
        demo.put('9', Arrays.asList('w', 'x', 'y', 'z'));

        ArrayList<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backtrack(0,digits,ans,demo,sb);
        return ans;

    }

    public void backtrack(int ind,String ip,ArrayList<String> ans,HashMap<Character, List<Character>> demo,StringBuilder sb){
        if(ind==ip.length()){
            ans.add(sb.toString());
            return;
        }

        List<Character> a=demo.get(ip.charAt(ind));
        for(Character i:a){
            sb.append(i);
            backtrack(ind+1,ip,ans,demo,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}