import java.util.HashMap;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                if(Math.abs(hashMap.get(nums[i]) - i) <= k){
                    return true;
                }
                else{
                    hashMap.put(nums[i], i);
                }
            }
            else{
                hashMap.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate2 containsDuplicate = new ContainsDuplicate2();
        int[] nums = {1,2,3,1,2,3};
        boolean ret = containsDuplicate.containsNearbyDuplicate(nums, 2);
        System.out.println(ret);
    }
}
