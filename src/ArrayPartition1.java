import java.util.Arrays;

public class ArrayPartition1 {
    public int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int ret = 0;
        for(int i = 0; i < nums.length; i += 2){
            ret += nums[i];
        }
        return ret;
    }

    public static void main(String[] args){
        ArrayPartition1 a = new ArrayPartition1();
        int[] nums = {1,4,3,2};
        int ret = a.arrayPairSum(nums);
        System.out.println(ret);
    }
}
