import java.util.ArrayList;
import java.util.List;

public class FindDisappearedInArr1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //利用下标，乘-1标记
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            //当然，只标记一次
            if(nums[idx] > 0){
                nums[idx] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        FindDisappearedInArr1 f = new FindDisappearedInArr1();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ret = f.findDisappearedNumbers(nums);
        System.out.println(ret);
    }
}
