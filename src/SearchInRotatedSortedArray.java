public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target){
        //修正二分查找,debug看懂，
        if(nums.length == 0 || (nums.length == 1 && nums[0] != target)) return -1;
        int left = 0, right = nums.length - 1;
        while(left <= right){
            //在左边
            int mid = (left + right) / 2;
            if(target == nums[mid]){
                return mid;
            }
            //在左边的条件还是写错了呀
            //就是这里写错了，在左边的条件，nums[left] <= target && nums[mid] > target，会有测试用例不通过
            //这时判断左边占大部分，还是右边占大部分。
            //如果左边占大部分，
            if(nums[left] <= nums[mid]){
//                right = mid - 1;
//                mid = (left + right) / 2;
//                if(target == nums[mid]){
//                    return mid;
//                }
                //并且target在这个上升的数组里面，
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            //在右边
            //if else，和if if还是有区别的
            else {
//                left = mid + 1;
//                mid = (left + right) / 2;
//                if(target == nums[mid]){
//                    return mid;
//                }
                //右边占大部分，并且target在这个上升的数组里面
                if(target <= nums[right] && target > nums[mid]){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        int[] nums = {5,1,3};
        int target = 5;
        int ret = s.search(nums, target);
        System.out.println(ret);
    }
}
