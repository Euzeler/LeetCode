public class FindPivotIndex1 {
    public int pivotIndex(int[] nums){
        //改进速度
        int right = 0, left = 0;
        for(int x : nums) {
            right += x;
        }
        //利用以前的累加求和的结果来简化复杂度。
        for(int i = 0; i < nums.length; i++) {
            //减的多，加得少，
            right -= nums[i];
            if(i > 0) left += nums[i-1];
            if(right == left) return i;
        }

        return -1;
    }

    public static void main(String[] args){
        FindPivotIndex1 fi = new FindPivotIndex1();
        int[] nums = {-1,-1,1,1,0,0};
        int ret = fi.pivotIndex(nums);
        System.out.println(ret);
    }
}
