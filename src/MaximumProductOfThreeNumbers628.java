import java.util.Arrays;

public class MaximumProductOfThreeNumbers628 {
    public int maximumProduct(int[] nums){
        //主要是有负数啊，
        Arrays.sort(nums);
        if(nums[nums.length - 1] > 0 && nums[nums.length - 2] > 0){
            if(nums[0] < 0 && nums[1] < 0){
                return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
                        nums[nums.length - 1] * nums[0] * nums[1]);
            }
            else {
                return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
            }
        }
//        else if(nums[nums.length - 1] > 0 && nums[nums.length - 2] > 0 && nums[nums.length - 3] <= 0){
//            if(nums[0] < 0 && nums[1] < 0){
//                return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
//                        nums[nums.length - 1] * nums[0] * nums[1]);
//            }
//            else {
//                return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
//            }
//        }
        else if(nums[nums.length - 1] > 0 && nums[nums.length - 2] <= 0){
            return nums[nums.length - 1] * nums[0] * nums[1];
        }
        else if(nums[nums.length - 1] == 0){
            return 0;
        }
        else if(nums[nums.length - 1] < 0){
            return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        }
        return -1;
    }

    public static void main(String[] args){
        MaximumProductOfThreeNumbers628 max = new MaximumProductOfThreeNumbers628();
        int[] nums = {1,2,3};
        int ret = max.maximumProduct(nums);
        System.out.println(ret);
    }
}
