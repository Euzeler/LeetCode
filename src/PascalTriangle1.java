import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        for(int i = 1; i < numRows; i++){
            List<Integer> before = result.get(i - 1);
            List<Integer> current = new ArrayList<>();
            for(int j = 0; j < before.size() + 1; j++){
                if(j == 0 || j == before.size()){
                    current.add(1);
                }
                else{
                    current.add((before.get(j) + before.get(j - 1)));
                }
            }
            result.add(current);
        }
        return result;
    }

    public static void main(String[] args){
        PascalTriangle1 pascalTriangle = new PascalTriangle1();
        List<List<Integer>> list = new ArrayList<>();
        list = pascalTriangle.generate(5);
        System.out.println(list);
    }
}
