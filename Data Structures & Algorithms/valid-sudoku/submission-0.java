class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rows = new HashSet<>();
            Set<Character> cols = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            
            for (int j = 0; j < 9; j++) {
                // Kiểm tra hàng
                if (board[i][j] != '.' && !rows.add(board[i][j])) return false;
                
                // Kiểm tra cột
                if (board[j][i] != '.' && !cols.add(board[j][i])) return false;
                
                // Kiểm tra box 3x3
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (board[rowIndex][colIndex] != '.' && !cube.add(board[rowIndex][colIndex])) return false;
            }
        }
        return true;
    }
}
