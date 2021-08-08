import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows){
        //存储小的List
        List<List<Integer>> list = new ArrayList<>();
        int[][] arr = new int[numRows][numRows];
        arr[0][0] = 1;
        List<Integer> first = new ArrayList<>();
        first.add(arr[0][0]);
        list.add(first);
        for(int i = 1; i < numRows; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j < numRows; j++){
                if(j == 0){
                    arr[i][j] = 1;
                }
                //少了一个else
                else arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                if(arr[i][j] != 0){
                    l.add(arr[i][j]);
                }
            }
            list.add(l);
        }
        return list;
    }

    public static void main(String[] args){
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> list = new ArrayList<>();
        list = pascalTriangle.generate(5);
        System.out.println(list);
    }
}
