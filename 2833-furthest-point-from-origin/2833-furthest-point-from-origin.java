class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int L = 0, R = 0, U = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') L++;
            else if (c == 'R') R++;
            else U++;
        }
        return Math.abs(R - L) + U;
    }
}