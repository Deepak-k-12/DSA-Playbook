class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public boolean solve(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }

        for (char ch = '1'; ch <= '9'; ch++) {
            if (is_safe(ch, row, col, board)) {
                board[row][col] = ch;
                if (solve(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public boolean is_safe(char ch, int row, int col, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) return false;
            if (board[i][col] == ch) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == ch) return false;
        }
        return true;
    }
}