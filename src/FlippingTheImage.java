public class FlippingTheImage {
    public int[][] flipAndInvertImage(int[][] image){
        StringBuilder[] tmp = new StringBuilder[image.length];
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image.length / 2; j++){
                swap(image[i], j, image.length - 1 - j);
            }
        }
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image.length; j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }
        return image;
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
