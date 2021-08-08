import java.util.ArrayList;
import java.util.List;

public class PascalTriangle3 {
    public List<Integer> getRow(int rowIndex){
        List<Integer> ans = new ArrayList<>();

        long res = 1;

        ans.add((int)res);  // Value at first index  -> 1//

        //now calculating nCr values for the given row

        for(int i=0; i<rowIndex; i++){
            //用的是杨辉三角的计算公式，这个是怎么解出来的？
            res *= (rowIndex-i);
            res /= (i+1);

            ans.add((int)res);
        }
        return ans;
    }

    public static void main(String[] args){
        PascalTriangle2 pascalTriangle2 = new PascalTriangle2();
        List<Integer> res = pascalTriangle2.getRow(3);
        System.out.println(res);
    }
}
