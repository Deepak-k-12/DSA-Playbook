class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        char ans[][] = new char[boxGrid[0].length][boxGrid.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = '.';
            }
        }
        for (int i = 0; i < boxGrid.length; i++) {
            int c1 = 0;
            int c2 = 0;
            for (int j = 0; j < boxGrid[0].length; j++) {
                if (boxGrid[i][j] == '#') {
                    c1 += 1;
                } else if (boxGrid[i][j] == '*') {
                    c2 = 1;
                    ans[j][ans[0].length - 1 - i] = '*';
                    helper(i, j, ans, c1);
                    c1 = 0;
                }
            }
            if (c1 != 0) {
                helper(i, boxGrid[0].length, ans, c1);
            }
        }
        return ans;
    }

    public void helper(int row, int col, char[][] ans, int c1) {
        for (int i = 1; i <= c1; i++) {
            ans[col - i][ans[0].length - 1 - row] = '#';
        }
    }
}