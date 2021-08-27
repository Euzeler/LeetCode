public class FloodFill1 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        //看来我给它扩展一圈是多此一举了，因为可以在递归的时候判断有没有越界呀。
        int prev = image[sr][sc];
        if(prev != newColor){
            changeColor(image, sr, sc, prev, newColor);
        }
        return image;
    }

    public void changeColor(int[][] image, int i, int j, int prev, int newColor){
        if(i < 0 || i >= image.length || j < 0 || j >= image[0].length){
            return;
        }
        //这里的越界怎么处理呢
        image[i][j] = newColor;
        if(i > 0 && image[i - 1][j] == prev) {
            image[i - 1][j] = newColor;
            changeColor(image, i - 1, j, prev, newColor);
        }
        if(i < image.length - 1 && image[i + 1][j] == prev) {
            image[i + 1][j] = newColor;
            changeColor(image, i + 1, j, prev, newColor);
        }
        if(j > 0 && image[i][j - 1] == prev) {
            image[i][j - 1] = newColor;
            changeColor(image, i, j - 1, prev, newColor);
        }
        if(j < image[0].length - 1 && image[i][j + 1] == prev) {
            image[i][j + 1] = newColor;
            changeColor(image, i, j + 1, prev, newColor);
        }
    }

    public static void main(String[] args){
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        FloodFill1 f = new FloodFill1();
        int[][] ret = f.floodFill(image, sr, sc, newColor);
        for(int i = 0; i < ret.length; i++){
            for (int j = 0; j < ret[0].length; j++){
                System.out.println(ret[i][j]);
            }
            System.out.println("换行");
        }
    }
}
