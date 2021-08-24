public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c){
        int num = 0;
        for(int i = 0; i < mat.length; i++){
            num += mat[i].length;
        }
        if(r * c != num){
            return mat;
        }
        else {
            int[][] ret = new int[r][c];
            int[] tmp = new int[num];
            int k = 0;
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length; j++){
                    tmp[k++] = mat[i][j];
                }
            }
            k = 0;
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    ret[i][j] = tmp[k++];
                }
            }
            return ret;
        }
    }

    public static void main(String[] args){
        ReshapeTheMatrix re = new ReshapeTheMatrix();
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] ret = re.matrixReshape(mat, r, c);
        System.out.println(ret);
    }
}
