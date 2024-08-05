class Solution {
    public boolean isValidSudoku(char[][] board) {
    
        for (int i = 0; i < 9; i++) {
            if (!isUnique(board[i])) return false;
        }
        
        for (int j = 0; j < 9; j++) {
            char[] column = new char[9];
            for (int i = 0; i < 9; i++) {
                column[i] = board[i][j];
            }
            if (!isUnique(column)) return false;
        }
        
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                char[] box = new char[9];
                int index = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        box[index++] = board[boxRow * 3 + i][boxCol * 3 + j];
                    }
                }
                if (!isUnique(box)) return false;
            }
        }
        
        return true;
    }
    
    private boolean isUnique(char[] chars) {
        java.util.Set<Character> set = new java.util.HashSet<>();
        for (char c : chars) {
            if (c != '.') {
                if (set.contains(c)) return false;
                set.add(c);
            }
        }
        return true;
    }
}
