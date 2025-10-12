class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int totalScore = 0;
        
        for (char c : s.toCharArray()) {
            totalScore += c - 'a' + 1;
        }
        
        int leftScore = 0;
        for (int i = 0; i < n - 1; i++) {
            leftScore += s.charAt(i) - 'a' + 1;
            int rightScore = totalScore - leftScore;
            
            if (leftScore == rightScore) {
                return true;
            }
        }
        
        return false;
    }
}
