public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        //看来我给它扩展一圈是多此一举了，因为可以在递归的时候判断有没有越界呀。
        if (image[sr][sc] == newColor) return image;
        else {
            int[][] imageExtension = new int[image.length + 2][image[0].length + 2];
            for (int i = 0; i < imageExtension[0].length; i++) {
                imageExtension[0][i] = -1;
                imageExtension[imageExtension.length - 1][i] = -1;
            }
            for (int i = 1; i < imageExtension.length - 1; i++) {
                for (int j = 0; j < imageExtension[0].length; j++) {
                    if (j == 0 || j == imageExtension[0].length - 1) {
                        imageExtension[i][j] = -1;
                    } else {
                        imageExtension[i][j] = image[i - 1][j - 1];
                    }
                }
            }

            changeColor(imageExtension, sr + 1, sc + 1, image[sr][sc], newColor);
            for (int i = 1; i < imageExtension.length - 1; i++) {
                for (int j = 1; j < imageExtension[0].length - 1; j++) {
                    image[i - 1][j - 1] = imageExtension[i][j];
                }
            }

            return image;
        }
    }

    public void changeColor(int[][] image, int sr, int sc, int prev, int newColor){
        int i = sr, j = sc;
        image[i][j] = newColor;
        if(image[i - 1][j] == prev) {
            image[i - 1][j] = newColor;
            changeColor(image, sr - 1, sc, prev, newColor);
        }
        if(image[i + 1][j] == prev) {
            image[i + 1][j] = newColor;
            changeColor(image, sr + 1, sc, prev, newColor);
        }
        if(image[i][j - 1] == prev) {
            image[i][j - 1] = newColor;
            changeColor(image, sr, sc - 1, prev, newColor);
        }
        if(image[i][j + 1] == prev) {
            image[i][j + 1] = newColor;
            changeColor(image, sr, sc + 1, prev, newColor);
        }
    }

    public static void main(String[] args){
        int[][] image = {{0,0,0},{0,1,1}};
        int sr = 1, sc = 1, newColor = 1;
        FloodFill f = new FloodFill();
        int[][] ret = f.floodFill(image, sr, sc, newColor);
        for(int i = 0; i < ret.length; i++){
            for (int j = 0; j < ret[0].length; j++){
                System.out.println(ret[i][j]);
            }
            System.out.println("换行");
        }
    }
}
