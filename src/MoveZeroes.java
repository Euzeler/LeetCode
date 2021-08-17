public class MoveZeroes {
    public void moveZeroes(int[] nums){
        //int count = 0;
        //投机取巧的办法解决数组越界是不可以的。
        if(nums[0] == 0){
            for(int i = 0; i < nums.length - 1; i++){
                swapNeighbor1(nums, i);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                //count++;
                for(int j = i; j < nums.length; j++){
                    swapNeighbor(nums, j);
                }
            }
        }
    }

    private void swapNeighbor(int[]nums, int i){
        int tmp = nums[i];
        nums[i] = nums[i - 1];
        nums[i - 1] = tmp;
    }

    private void swapNeighbor1(int[]nums, int i){
        int tmp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = tmp;
    }

    public static void main(String[] args){
        MoveZeroes m = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        m.moveZeroes(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
