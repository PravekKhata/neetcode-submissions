class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // Rule 3: each 3x3 box
        for(int boxRow = 0; boxRow < 9; boxRow += 3){
            for(int boxCol = 0; boxCol < 9; boxCol += 3){

                Set<Character> seen = new HashSet<>();

                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        char c = board[boxRow + i][boxCol + j];
                        if(c == '.') continue;
                        if(!seen.add(c)) return false;
                    }   
                }
            }
        }


        // Rule 1: for each row

        for(int r = 0; r < 9; r++){
            Set<Character> seen = new HashSet<>();
            for(int c = 0; c < 9; c++){
                char ch = board[r][c];
                if(ch == '.') continue;
                if(!seen.add(ch)) return false;
            }   
        }

        // Rule 2: for each column

        for(int c = 0; c < 9; c++){
            Set<Character> seen = new HashSet<>();
            for(int r = 0; r < 9; r++){
                char ch = board[r][c];
                if(ch == '.') continue;
                if(!seen.add(ch)) return false;
            }   
        }

        return true;
    }
}
