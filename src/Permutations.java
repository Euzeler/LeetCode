import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums){
        //排列组合，其实就是一个下标的问题，
        List<List<Integer>> ret = new ArrayList<>();

        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            numList.add(nums[i]);
        }

        int N = nums.length;
        while(N > 1){
            List<Integer> oneRet = new ArrayList<>();
            for(int i = 0; i < N; i++){
                oneRet.add(numList.get(i));
                numList.remove(i);
            }
            N--;
            ret.add(oneRet);
        }

        return ret;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        Permutations pe = new Permutations();
        List<List<Integer>> ret = pe.permute(nums);
        System.out.println(ret);
    }
}
