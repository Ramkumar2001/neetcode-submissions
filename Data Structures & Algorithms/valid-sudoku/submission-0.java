class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9]; //0 through 9 rows
        int[] col = new int[9]; //0 through 9 cols
        int[][] square = new int[3][3]; //9 squares

        for(int i = 0; i < 9; i += 1){
            for(int j = 0; j < 9; j += 1){
                if(board[i][j] == '.') continue;

                int num = board[i][j] - '0';
                if((row[i] & (1 << num)) > 0 || 
                (col[j] & (1 << num)) > 0 || 
                (square[i/3][j/3] & (1 << num)) > 0){
                    return false;
                }

                row[i] |= 1 << num;
                col[j] |= 1 << num;
                square[i/3][j/3] |= 1 << num;
            }
        }
        return true; 
    }
}
