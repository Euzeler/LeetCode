public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums){
        //调了好久
        if(nums.length == 1 && nums[0] == 0) return 0;
        int ret = 0;
        int i = 0;
        int count = 0;
        while(i < nums.length){
            if(i == nums.length - 1){
                if(nums[i] == 1){
                    count++;
                    ret = Math.max(ret, count);
                }
            }

            if(nums[i] == 0 && i < nums.length){
                if(count == 0) {
                    i++;
                    continue;
                }
                else if(count != 0){
                    ret = Math.max(ret, count);
                    count = 0;
                    i++;
                }
            }

            if(i < nums.length && nums[i] == 1){
                count++;
                i++;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        int[] nums = {1};
        int ret = m.findMaxConsecutiveOnes(nums);
        System.out.println(ret);
    }
}

//1
//1,1,0,1,1,1
//0,1