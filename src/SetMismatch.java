import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums){
        int[] ret = new int[2];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                ret[0] = nums[i];
            }
            if(nums[0] == 2){
                ret[1] = 1;
            }
            else if(nums[i + 1] - nums[i] == 2){
                ret[1] = nums[i + 1] - 1;
            }
            else if(i == nums.length - 2 && ret[1] == 0){
                ret[1] = nums[i + 1] + 1;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        SetMismatch set = new SetMismatch();
        int[] nums = {1,5,3,2,2,7,6,4,8,9};
        int[] ret = set.findErrorNums(nums);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
