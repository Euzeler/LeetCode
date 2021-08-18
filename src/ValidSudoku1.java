import java.util.HashSet;

public class ValidSudoku1 {
    public class ValidSudoku {
        public boolean isValidSudoku(char[][] board) {
            //boolean isValid = false;
            //横,i

            for (int i = 0; i < 9; i++) {
                //这句话的位置幼。。
                HashSet<Character> hashSet100 = new HashSet<>();
                for (int j = 0; j < 9; j++) {

                    if (board[i][j] == '.') {
                        continue;
                    } else if (board[i][j] < '1' || board[i][j] > '9') {
                        return false;
                    } else {
                        if (hashSet100.contains(board[i][j])) {
                            return false;
                        } else {
                            hashSet100.add(board[i][j]);
                        }
                    }
                }
                hashSet100.clear();
            }

            //纵

            for (int j = 0; j < 9; j++) {
                HashSet<Character> hashSet101 = new HashSet<>();
                for (int i = 0; i < 9; i++) {
                    //这个的位置，讲究啊，一个循环一个hash

                    if (board[i][j] == '.') {
                        continue;
                    } else if (board[i][j] < '1' || board[i][j] > '9') {
                        return false;
                    } else {
                        if (hashSet101.contains(board[i][j])) {
                            return false;
                        } else {
                            hashSet101.add(board[i][j]);
                        }
                    }
                }
                hashSet101.clear();
            }

            //明天写小方块
            
            return true;
        }
    }
}

//[["5","3",".",".","7",".",".",".","."],
// ["6",".",".","1","9","5",".",".","."],
// [".","9","8",".",".",".",".","6","."],
// ["8",".",".",".","6",".",".",".","3"],
// ["4",".",".","8",".","3",".",".","1"],
// ["7",".",".",".","2",".",".",".","6"],
// [".","6",".",".",".",".","2","8","."],
// [".",".",".","4","1","9",".",".","5"],
// [".",".",".",".","8",".",".","7","9"]]

//[["5","3",".",".","7",".",".",".","."],
// ["6",".",".","1","9","5",".",".","."],
// [".","9","8",".",".",".",".","6","."],
// ["8",".",".",".","6",".",".",".","3"],
// ["4",".",".","8",".","3",".",".","1"],
// ["7",".",".",".","2",".",".",".","6"],
// [".","6",".",".",".",".","2","8","."],
// [".",".",".","4","1","9",".",".","5"],
// [".",".",".",".","8",".",".","7","9"]]

//考试的时候，这个逻辑搞对，能做 473/507 出来，挺不错的了。