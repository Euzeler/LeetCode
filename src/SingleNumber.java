public class SingleNumber {
    public int singleNumber(int[] nums){
        //用亦或，亦或有交换律和结合律
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args){
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        int res = singleNumber.singleNumber(nums);
        System.out.println(res);
    }
}
