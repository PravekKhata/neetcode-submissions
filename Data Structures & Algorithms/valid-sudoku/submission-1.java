class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;          // empty cell, nothing to check

                int d = board[r][c] - '1';                 // digit -> index 0..8
                int b = (r / 3) * 3 + (c / 3);             // which box

                if (rows[r][d] || cols[c][d] || boxes[b][d]) {
                    return false;                          // already ticked somewhere
                }

                rows[r][d] = true;                         // tick all three checklists
                cols[c][d] = true;
                boxes[b][d] = true;
            }
        }
        return true;
    }
}