import java.util.Arrays;

public class _3SumClosest {
    public int threeSumClosest(int[] nums, int target){
        //总是不对，看答案吧
        int ret = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i + 2 < nums.length; i++){

            int j = i + 1, k = nums.length - 1;
            while(j < k){
                if(j < k && nums[i] + nums[j] + nums[k] > target) {
                    k--;
                }
                else break;
            }
            if(Math.abs(nums[i] + nums[j] + nums[k] - target) < ret){
                ret = nums[i] + nums[j] + nums[k];
            }

            int j1 = i + 1, k1 = nums.length - 1;
            while(j1 < k1){
                if(j1 < k1 && nums[i] + nums[j] + nums[k] <= target) {
                    j1++;
                }
                else break;
            }
            if(Math.abs(nums[i] + nums[j1] + nums[k1] - target) < ret){
                ret = nums[i] + nums[j1] + nums[k1];
            }
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        int target = 1;
        _3SumClosest _3SC = new _3SumClosest();
        int ret = _3SC.threeSumClosest(nums, target);
        System.out.println(ret);
    }
}
