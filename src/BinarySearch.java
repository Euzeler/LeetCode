public class BinarySearch {
    public int search(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                //这个怎么还写错啊，
                //写成了right = right - 1
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        BinarySearch bi = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int ret = bi.search(nums, target);
        System.out.println(ret);
    }
}
