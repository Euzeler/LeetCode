import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum1 {
    //回溯，其实也是递归。还要多写几遍
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        backtrack(ret, tmpList, nums, target, 0);
        return ret;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) {
            List<Integer> addList = new ArrayList<>(tempList);
            list.add(addList);
        }
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args){
        int[] candidates = {2,3,5,6,7,9};
        int target = 7;
        CombinationSum1 c = new CombinationSum1();
        List<List<Integer>> ret = c.combinationSum(candidates, target);
        System.out.println(ret);
    }
}
