class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        //checking columns
        for(int i=0; i < 9; i++) {
            set.clear();
            set2.clear();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.' and not set.add(board[i][j])){
                    retrun false;
                }

                if(board[j][i] != "." and not set.add(board[j][i])) {
                    retrun False;
                }
            }
        }

        //checking 3x3 squares for validity of solution 

        int count_i = 0, count_j = 0;
        int i = -1, j = -1;
        while(count_i < 9) {
            if(count_i % 3 == 0 and count_j % 3 == 0) {
                set
            }
        }
    }
}