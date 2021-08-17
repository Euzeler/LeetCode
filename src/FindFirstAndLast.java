public class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target){
        //二分查找,找到首次出现的，如果没出现，返回-1,-1，如果出现了，
        // 二分查找找到尾巴出现的，
        int[] a = {};
        return a;
    }

    public int binarySearch(int[] nums, int target){
        //竟然是这个不起眼的idx发挥了作用，debug来看看是如何发生作用的，
        int idx = -1;
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;

//            if(target <= nums[mid]){
////                right = mid - 1;
////            }
////            else{
////                left = mid + 1;
////            }
            if(target >= nums[mid]){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
            if(target == nums[mid]){
                //它并没有很快地返回，而是赋值一下，待会儿继续赋值的，
                idx = mid;
            }
        }
        return idx;
    }

    private int findLast(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,8,8,10};
        int target = 8;
        FindFirstAndLast f = new FindFirstAndLast();
        int[] ret = f.searchRange(nums, target);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
        int ret1 = f.binarySearch(nums, 8);
        System.out.println("二分查找的结果：" + ret1);
    }
}
