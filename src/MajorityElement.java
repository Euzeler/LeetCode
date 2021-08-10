import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    public static void main(String[] args){
        MajorityElement majorityElement = new MajorityElement();
        int[] arr = {2,2,1,1,1,2,2};
        int res = majorityElement.majorityElement(arr);
        System.out.println(res);
    }
}
