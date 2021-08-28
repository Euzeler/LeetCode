public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix){
        //对角线的起点是第一行和第一列
        for(int k = 0; k < matrix[0].length; k++) {
            int i = 0, j = k;
            while (i < matrix.length && j < matrix[0].length) {
                if (i + 1 < matrix.length && j + 1 < matrix[0].length &&
                        matrix[i + 1][j + 1] != matrix[i][j]) {
                    return false;
                } else {
                    i++;
                    j++;
                }
            }
        }
        for(int k = 1; k < matrix.length; k++){
            int i = k, j = 0;
            while (i < matrix.length && j < matrix[0].length) {
                if (i + 1 < matrix.length && j + 1 < matrix[0].length &&
                        matrix[i + 1][j + 1] != matrix[i][j]) {
                    return false;
                } else {
                    i++;
                    j++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        //
        ToeplitzMatrix to = new ToeplitzMatrix();
        int[][] matrix = {{1,2,2,4},
                          {5,1,2,2},
                          {9,5,1,2}};
        boolean ret = to.isToeplitzMatrix(matrix);
        System.out.println(ret);
    }
}
