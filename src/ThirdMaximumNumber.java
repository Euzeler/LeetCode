import java.util.Arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums){
        Arrays.sort(nums);
        if(nums.length < 3) return nums[nums.length - 1];
        int count = 1;
        for(int i = nums.length - 1; i > 0; i--){

            if(nums[i] != nums[i - 1]){
                count++;
            }
            if(count == 3) {
                return nums[i - 1];
            }
        }
        if(count == 3){
            return nums[0];
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args){
        ThirdMaximumNumber th = new ThirdMaximumNumber();
        int[] nums = {5,2,4,1,3,6,0};
        int ret = th.thirdMax(nums);
        System.out.println(ret);
    }
}
