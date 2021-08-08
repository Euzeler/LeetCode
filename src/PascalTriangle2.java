import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        //第一个重复是为了对上题目的下标
        result.add(first);
        for(int i = 1; i < rowIndex + 1; i++){
            List<Integer> before = result.get(i - 1);
            List<Integer> current = new ArrayList<>();
            for(int j = 0; j < before.size() + 1; j++){
                if(j == 0 || j == before.size()){
                    current.add(1);
                }
                else{
                    current.add(before.get(j) + before.get(j - 1));
                }
            }
            result.add(current);
        }
        return result.get(rowIndex);
    }

    public static void main(String[] args){
        PascalTriangle2 pascalTriangle2 = new PascalTriangle2();
        List<Integer> res = pascalTriangle2.getRow(3);
        System.out.println(res);
    }
}
