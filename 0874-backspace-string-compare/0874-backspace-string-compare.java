class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }

    public String check(String s){
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()){
                stack.pop();}
            }
        }
        StringBuilder str=new StringBuilder();
        for(Character i:stack){
            str.append(i);
        }
        return str.toString();

    }
}