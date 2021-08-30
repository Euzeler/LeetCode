import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups830 {
    public List<List<Integer>> largeGroupPositions(String s){
        List<List<Integer>> ret = new ArrayList<>();
        int count = 1;
        for(int i = 0; i < s.length() - 1; i++){

            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
            }
            else{
                if(count >= 3){
                    List<Integer> list = new ArrayList<>();
                    list.add(i - count + 1);
                    list.add(i);
                    ret.add(list);
                }
                count = 1;
            }
        }
        if(count >= 3){
            List<Integer> list = new ArrayList<>();
            list.add(s.length() - count);
            list.add(s.length() - 1);
            ret.add(list);
        }
        //最后一个元素没有考虑进去。
        return ret;
    }

    public static void main(String[] args){
        PositionsOfLargeGroups830 po = new PositionsOfLargeGroups830();
        String s = "aaaa";
        List<List<Integer>> ret = po.largeGroupPositions(s);
        for(int i = 0; i < ret.size(); i++){
            System.out.println(ret.get(i));
        }
    }
}
