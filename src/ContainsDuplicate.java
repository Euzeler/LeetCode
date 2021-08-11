import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containDuplicate(int[] nums){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                return true;
            }
            else hashMap.put(nums[i], 1);
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean ret = containsDuplicate.containDuplicate(nums);
        System.out.println(ret);
    }
}
