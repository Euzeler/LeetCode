public class FlippingTheImage_1 {
    public int[][] flipAndInvertImage(int[][] image){
        int[][] ret = new int[image.length][image[0].length];
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                ret[i][j] = ret[i][image[0].length - 1 - j];
            }
        }
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                ret[i][j] = ret[i][j] ^ 1;
            }
        }
        return ret;
        //他这个两毫秒，还不如我呢
    }

    public void swap(int[] arr, int i, int j){

    }

    public static void main(String[] args){
        FlippingTheImage fl = new FlippingTheImage();
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] ret = fl.flipAndInvertImage(image);
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                System.out.println(ret[i][j]);
            }
            System.out.println("一个 ");
        }
    }
}
