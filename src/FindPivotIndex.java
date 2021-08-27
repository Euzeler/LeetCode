public class FindPivotIndex {
    public int pivotIndex(int[] nums){
        //自己不算
        int sum = 0;
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum == 0) return 0;


        for(int i = 1; i < nums.length - 1; i++){
            int sumLeft = 0, sumRight = 0;
            for(int j = 0; j < i; j++){
                sumLeft += nums[j];
            }
            for(int k = i + 1; k < nums.length; k++){
                sumRight += nums[k];
            }
            if(sumLeft == sumRight) return i;
        }

        sum = 0;
        for(int i = 0; i < nums.length - 1; i++){
            sum += nums[i];
        }
        if(sum == 0) return nums.length - 1;
        return -1;
    }

    public static void main(String[] args){
        FindPivotIndex fi = new FindPivotIndex();
        int[] nums = {-1,-1,1,1,0,0};
        int ret = fi.pivotIndex(nums);
        System.out.println(ret);
    }
}
