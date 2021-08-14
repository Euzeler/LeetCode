public class MissingNumber {
    public int missingNumber(int[] nums){
        //全加起来嘛
        int realSum = 0;
        for(int i = 0; i < nums.length; i++){
            realSum += nums[i];
        }
        return (0 + nums.length) * (nums.length + 1) / 2 - realSum;
    }

    public static void main(String[] args){
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {3,0,1};
        int ret = missingNumber.missingNumber(nums);
        System.out.println(ret);
    }
}
