public class MoveZeroes2 {
    public void moveZeroes(int[] nums){
        //利用下标，也没新建数组呐，利用数组的下标，做到过好几次啦。
        if(nums.length == 1 || nums.length == 0){
            return;
        }
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[idx] = nums[i];
                idx++;
            }
        }
        for(int i = idx; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args){
        MoveZeroes2 m = new MoveZeroes2();
        int[] nums = {0,0,1};
        m.moveZeroes(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
