class Solution {
    public boolean judgeCircle(String moves) {
        int up=0;
        int down=0;
        int left=0;
        int right=0;

        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U') up+=1;
            else if(ch=='D') down+=1;
            else if(ch=='L') left+=1;
            else right+=1;
        }

        return ((up==down) && (left==right));
    }
}