import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> ret = new LinkedList<>();
        int I = 0;
        for(int i = 0; candidates[i] < target; i++) I = i;
        //System.out.println("测试1：" + I);I是小于target的数的下标，就在[0, I]找，
        if(target == candidates[I + 1]){
            List<Integer> tmpRet = new LinkedList<>();
            tmpRet.add(candidates[I + 1]);
            ret.add(tmpRet);
        }
        //[0, I]中的值都是小于target的，所以至少要两个数相加才行，
        int left = 0, right = I;
        List<Integer> tmpRet1 = new LinkedList<>();
        while(left < right){
            if(candidates[left] + candidates[right] == target){
                tmpRet1.add(candidates[left], candidates[right]);
                ret.add(tmpRet1);
            }
        }

        //迭代？设计不出来算法。
        return ret;
    }

    public static void main(String[] args){
        int[] candidates = {2,3,5,6,7,9};
        int target = 7;
        CombinationSum c = new CombinationSum();
        List<List<Integer>> ret = c.combinationSum(candidates, target);
        System.out.println(ret);
    }
}
