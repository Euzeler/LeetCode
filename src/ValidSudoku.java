import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board){
        boolean isValid = false;
        //横,i
        HashSet<Character> hashSet100 = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet100.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet100.add(board[i][j]);
                    }
                }
            }
        }

        //纵
        HashSet<Character> hashSet101 = new HashSet<>();
        for(int j = 0; j < 9; j++){
            for(int i = 0; i < 9; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet101.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet101.add(board[i][j]);
                    }
                }
            }
        }

        //小方块
//        int I = 0, J = 0;
//        while(I <= 6 && J <= 6) {
//            HashSet<Character> hashSet = new HashSet<>();
//            for (int i = 0 + I; i < 3 + I; i++) {
//                for (int j = 0 + J; j < 3 + J; j++) {
//
//                    if (board[i][j] < '1' || board[i][j] > '9') {
//                        return false;
//                    } else if (board[i][j] == '.') {
//                        continue;
//                    } else {
//                        if (hashSet.contains(board[i][j])) {
//                            return false;
//                        } else {
//                            hashSet.add(board[i][j]);
//                        }
//                    }
//                }
//                J += 3;
//            }
//            I += 3;
//            hashSet.clear();
//        }

        // 344/507个测试用例，还行吧
        //应该就是小方块这里搞错了。
        //改了报一样的错，可能是哪里不对了。

        HashSet<Character> hashSet1 = new HashSet<>();
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet1.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet1.add(board[i][j]);
                    }
                }
            }
        }

        HashSet<Character> hashSet2 = new HashSet<>();
        for(int j = 0; j < 3; j++){
            for(int i = 3; i < 6; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet2.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet2.add(board[i][j]);
                    }
                }
            }
        }

        HashSet<Character> hashSet3 = new HashSet<>();
        for(int j = 0; j < 3; j++){
            for(int i = 6; i < 9; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet3.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet3.add(board[i][j]);
                    }
                }
            }
        }

        HashSet<Character> hashSet4 = new HashSet<>();
        for(int j = 3; j < 6; j++){
            for(int i = 0; i < 3; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet4.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet4.add(board[i][j]);
                    }
                }
            }
        }

        HashSet<Character> hashSet5 = new HashSet<>();
        for(int j = 3; j < 6; j++){
            for(int i = 3; i < 6; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet5.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet5.add(board[i][j]);
                    }
                }
            }
        }

        HashSet<Character> hashSet6 = new HashSet<>();
        for(int j = 3; j < 6; j++){
            for(int i = 6; i < 9; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet6.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet6.add(board[i][j]);
                    }
                }
            }
        }

        HashSet<Character> hashSet7 = new HashSet<>();
        for(int j = 6; j < 9; j++){
            for(int i = 0; i < 3; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet7.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet7.add(board[i][j]);
                    }
                }
            }
        }

        HashSet<Character> hashSet8 = new HashSet<>();
        for(int j = 6; j < 9; j++){
            for(int i = 3; i < 6; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet8.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet8.add(board[i][j]);
                    }
                }
            }
        }

        HashSet<Character> hashSet9 = new HashSet<>();
        for(int j = 6; j < 9; j++){
            for(int i = 6; i < 9; i++){

                if(board[i][j] < '1' || board[i][j] > '9'){
                    return false;
                }
                else if(board[i][j] == '.'){
                    continue;
                }
                else{
                    if(hashSet9.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hashSet9.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }



    public static void main(String[] args){

    }
}
