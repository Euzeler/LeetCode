public class IslandPerimeter {
    public int islandPerimeter(int[][] grid){
        //遍历每一个为1的点，看它的上下左右，没有的话就count++
        //处理越界，可以创建一个新的数组
        int[][] grid1 = new int[grid.length + 2][grid[0].length + 2];
        for(int i = 0; i < grid1.length; i++){
            if(i == 0 || i == grid1.length - 1){
                for(int j = 0; j < grid1[0].length; j++) {
                    grid1[i][j] = 0;
                }
            }
            else{
                grid1[i][0] = 0;
                grid1[i][grid1[0].length - 1] = 0;
                for(int k = 1; k < grid1[0].length - 1; k++){
                    grid1[i][k] = grid[i - 1][k - 1];
                }
            }
        }
        int count = 0;
        for(int i = 1; i < grid1.length - 1; i++){
            for(int j = 1; j < grid1[i].length - 1; j++){
                if(grid1[i][j] == 1) {
                    if (grid1[i - 1][j] == 0) {
                        count++;
                    }
                    if (grid1[i][j - 1] == 0) {
                        count++;
                    }
                    if (grid1[i][j + 1] == 0) {
                        count++;
                    }
                    if (grid1[i + 1][j] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        IslandPerimeter i = new IslandPerimeter();
        int[][] grid = {{1}, {0}};
        int ret = i.islandPerimeter(grid);
        System.out.println(ret);
    }
}

//{{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}}