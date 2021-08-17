import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum1 {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        //remain是还差多少，
        if(remain < 0) return;
        else if(remain == 0) {
            List<Integer> addList = new ArrayList<>(tempList);
            list.add(addList);
            //list.add(new ArrayList<>(tempList));
        }
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
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
