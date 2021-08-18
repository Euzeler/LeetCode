import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedInArr {
    public List<Integer> findDisappearedNumbers(int[] nums){
        //先要常规方法，sort，
        // 1,2,2,3,3,4,5,8
        // 1,2,3,4,5,6,7,8
        List<Integer> ret = new ArrayList<>();
        Arrays.sort(nums);

        //头部缺少的，
        if(nums[0] - 1 > 0){
            int missNum3 = nums[0] - 1;
            for(int i = 1; i < missNum3 + 1; i++){
                ret.add(i);
            }
        }

        //中间缺少的
        for(int i = 0; i < nums.length - 1; i++){
            int I = i;
            if(nums[I + 1] - nums[I] > 1){
                int missNum = nums[I + 1] - nums[I] - 1;
                for(int j = 1; j < missNum + 1; j++){
                    ret.add(nums[I] + j);
                }
            }
        }
//        if(nums[nums.length - 1] - nums[nums.length - 2] > 1){
//            int missNum2 = nums[nums.length - 1] - nums[nums.length - 2] - 1;
//            for(int i = 1; i < missNum2 + 1; i++){
//                ret.add(nums[nums.length - 2] + i);
//            }
//        }

        //尾巴缺少的，
        if(nums.length - nums[nums.length - 1] > 0){
            int missNum1 = nums.length - nums[nums.length - 1];
            for(int i = 1; i < missNum1 + 1; i++){
                ret.add(nums[nums.length - 1] + i);
            }
        }
        return ret;
    }

    public static void main(String[] args){
        FindDisappearedInArr f = new FindDisappearedInArr();
        int[] nums = {2,2};
        List<Integer> ret = f.findDisappearedNumbers(nums);
        System.out.println(ret);
    }
}
