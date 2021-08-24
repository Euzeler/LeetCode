import java.util.Arrays;
import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums){
        if(nums.length == 1) return 0;
        HashMap<Integer, Integer> hashMap = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], 1);
            }
            else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }

//        Arrays.sort(nums);
//        int ret = 0;
//        int i = 0;
//        while(i < nums.length - 1){
//            if(nums[i + 1] - nums[i] == 1){
//                ret = Math.max(ret, hashMap.get(nums[i + 1]) + hashMap.get(nums[i]));
//            }
//            i++;
//        }
//        if(nums[nums.length - 1] - nums[nums.length - 2] == 1){
//            ret = Math.max(ret, hashMap.get(nums[nums.length - 1]) +
//                    hashMap.get(nums[nums.length - 2]));
//        }
        //判定条件变一下
        int ret = 0;
        for(Integer key : hashMap.keySet()){
            if(hashMap.containsKey(key + 1)){
                ret = Math.max(ret, hashMap.get(key) + hashMap.get(key + 1));
            }
        }
        return ret;
    }

    public static void main(String[] args){
        LongestHarmoniousSubsequence l = new LongestHarmoniousSubsequence();
        int[] nums = {1,1,1,1};
        int ret = l.findLHS(nums);
        System.out.println(ret);
    }
}
