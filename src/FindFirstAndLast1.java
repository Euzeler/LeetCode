public class FindFirstAndLast1 {
    public int[] searchRange(int[] nums, int target){

        int[] ret = new int[2];
        ret[0] = findFirst(nums, target);
        ret[1] = findLast(nums, target);
        return ret;
    }

    private int findFirst(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int idx = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(target <= nums[mid]){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            if(target == nums[mid]){
                idx = mid;
            }
        }
        return idx;
    }

    private int findLast(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int idx = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(target >= nums[mid]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            if(target == nums[mid]){
                idx = mid;
            }
        }
        return idx;
    }

    public static void main(String[] args){
        FindFirstAndLast1 f = new FindFirstAndLast1();
        int[] nums = {5,7,8,8,8,8,8,8,10};
        int target = 8;
        int ret = f.findFirst(nums, target);
        int ret2 = f.findLast(nums, target);
        System.out.println(ret2);
    }
}
