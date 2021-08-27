public class FindPivotIndex2 {
    public int pivotIndex(int[] nums){
        //改进速度
        int leftSum = 0, rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            rightSum -= nums[i];
            if(i > 0){
                leftSum += nums[i - 1];
            }
            if(leftSum == rightSum) return i;
        }

        return -1;
    }

    public static void main(String[] args){
        FindPivotIndex2 fi = new FindPivotIndex2();
        int[] nums = {-1,-1,1,1,0,0};
        int ret = fi.pivotIndex(nums);
        System.out.println(ret);
    }
}
