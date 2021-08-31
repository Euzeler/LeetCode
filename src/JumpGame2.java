public class JumpGame2 {
    public int jump(int[] nums){
        //有点儿像刚才那道opt的题目，用空间换时间，动态规划

        //sc: minimum steps for reaching e
        int step_count = 0;
        int prev_jump_max = 0;
        int curr_jump_max = 0;
        for(int i = 0; i < nums.length - 1; i++){
            curr_jump_max = Math.max(curr_jump_max, i + nums[i]);
            if(i == prev_jump_max){
                step_count++;
                prev_jump_max = curr_jump_max;
            }
        }
        return step_count;
    }

    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        JumpGame2 jump = new JumpGame2();
        int ret = jump.jump(nums);
        System.out.println(ret);
    }
}
