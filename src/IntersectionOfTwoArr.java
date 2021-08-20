import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArr {
    public int[] intersection(int[] nums1, int[] nums2){
        List<Integer> ret = new LinkedList<>();
        int minLen = Math.min(nums1.length, nums2.length);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length >= nums2.length) {
            if(binarySearch(nums1, nums2[0])){
                ret.add(nums2[0]);
            }
            for (int i = 1; i < minLen; i++) {
                if (nums2[i] > nums2[i - 1] && binarySearch(nums1, nums2[i])) {
                    ret.add(nums2[i]);
                }
            }
        }
        else{
            if(binarySearch(nums2, nums1[0])){
                ret.add(nums1[0]);
            }
            for (int i = 1; i < minLen; i++) {
                if (nums1[i] > nums1[i - 1] && binarySearch(nums2, nums1[i])) {
                    ret.add(nums1[i]);
                }
            }
        }
        int[] ret1 = new int[ret.size()];
        for(int i = 0; i < ret.size(); i++){
            ret1[i] = ret.get(i);
        }
        return ret1;
    }

    public boolean binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        //二分查找，是<=
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        IntersectionOfTwoArr in = new IntersectionOfTwoArr();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ret = in.intersection(nums1, nums2);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
