public class MoveZeroes1 {
    public void moveZeroes(int[] nums){
        //int count = 0;
        //投机取巧的办法解决数组越界是不可以的。
        if(nums.length == 0 || nums.length == 1){
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                //count++;
                for(int j = i; j < nums.length - 1; j++){
                    swapNeighbor(nums, j);
                }
            }
        }
        if(nums.length > 2 && nums[nums.length - 1] == 0){
            swapNeighbor(nums, nums.length - 2);
        }
    }

    private void swapNeighbor(int[]nums, int i){
        int tmp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = tmp;
    }

    public static void main(String[] args){
        MoveZeroes1 m = new MoveZeroes1();
        int[] nums = {0,0,1};
        m.moveZeroes(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
