import java.math.BigInteger;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int [] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(hashMap.get(target - nums[i]) != null){
                res[0] = i;
                res[1] = hashMap.get(target - nums[i]);
                if (res[0] != res[1]){
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int [] a = {1,5,6,8};
        int [] b = ts.twoSum(a, 9);
        System.out.println(b[0]);
        System.out.println(b[1]);

        //Try

    }
}
