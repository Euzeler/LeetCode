public class MaximumSubarray {
    public int maxSubArray(int[] nums){
        int max = 0;
        int globalMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max += nums[i];
            globalMax = Math.max(max, globalMax);
            // 这一步相当于抛弃前面的，从头开始，保证了连续
            if(max < 0) max = 0;
        }
        return globalMax;
    }

    public static void main(String[] args){
        MaximumSubarray m = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = 0;
        res = m.maxSubArray(nums);
        System.out.println(res);
    }
}

