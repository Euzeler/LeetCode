public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums){
        int ret = 1;
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] > nums[i]){
                count++;
                if(i == nums.length - 2){
                    ret = Math.max(ret, count);
                }
            }
            else{
                ret = Math.max(ret, count);
                count = 1;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        LongestContinuousIncreasingSubsequence lo = new LongestContinuousIncreasingSubsequence();
        int[] nums = {1,3,5,7};
        int ret = lo.findLengthOfLCIS(nums);
        System.out.println(ret);
    }
}
