import java.util.Arrays;

public class _3SumClosest1 {
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum - target) < Math.abs(diff)){
                    diff = sum - target;
                }
                if(sum > target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return diff + target;
    }

    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        int target = 1;
        _3SumClosest1 _3SC = new _3SumClosest1();
        int ret = _3SC.threeSumClosest(nums, target);
        System.out.println(ret);
    }
}
