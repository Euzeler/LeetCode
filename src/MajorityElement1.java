import java.util.HashMap;

public class MajorityElement1 {
    public int majorityElement(int[] nums){
        //用hashMap
        int res = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //debug出来基础的循环搞错了
        for(int i = 0; i < nums.length; i++){
            if(hashMap.get(nums[i]) == null){
                hashMap.put(nums[i], 1);
            }
            else hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            if(hashMap.get(nums[i]) > nums.length / 2){
                res = nums[i];
                break;
            }
        }
        return res;
    }

    public static void main(String[] args){
        MajorityElement1 majorityElement = new MajorityElement1();
        int[] nums = {2,2,1,1,1,2,2};
        int res = majorityElement.majorityElement(nums);
        System.out.println(res);
    }
}
