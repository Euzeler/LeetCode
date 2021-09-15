public class RotateImage_48 {
    public void retate(int[][] matrix){
        //不要开辟新的空间
        for(int i = 0; i < matrix.length / 2; i++){
            for(int j = i; j < matrix.length - 2 * i - 1 + i; j++){
                int tmp0 = matrix[i][j];
                int tmp1 = matrix[j][matrix.length - 1 - i];
                int tmp2 = matrix[matrix.length - 1 - i][matrix.length - 1 - j];

                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[j][matrix.length - 1 - i] = tmp0;
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = tmp1;
                matrix[matrix.length - 1 - j][i] = tmp2;
            }
            //无论结果如何，给自己点个赞！
//            if(matrix.length - 2 * i - 1 == 1){
//                int j = i;
//                int tmp0 = matrix[i][j];
//                matrix[i][j] = matrix[matrix.length - 1 - j][i];
//                int tmp1 = matrix[i + j][matrix.length - 1 - i];
//                //get
//                matrix[i + j][matrix.length - 1 - i] = tmp0;
//                int tmp2 = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
//                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = tmp1;
//                matrix[matrix.length - 1 - j][i] = tmp2;
//            }
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        // {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}}
        // {{1,2,3}, {4,5,6}, {7,8,9}}
        // {{4,8}, {3,6}}
        RotateImage_48 r = new RotateImage_48();
        r.retate(matrix);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
