public class NextGreaterElement2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        //用空间换时间
        int[] map = new int[10000];
        //nums[i]和i对换
        for(int i = 0; i < nums2.length; i++){
            map[nums2[i]] = i;
        }
        for(int i = 0; i < nums1.length; i++){
            for(int j = map[nums1[i]]; j < nums2.length; j++){
                if(nums1[i] < nums2[j]){
                    nums1[i] = nums2[j];
                    break;
                }
                if(j == nums2.length - 1 && nums1[i] >= nums2[j]){
                    nums1[i] = -1;
                }
            }
        }
        return nums1;
    }

    public static void main(String[] args){
        NextGreaterElement2 n = new NextGreaterElement2();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ret = n.nextGreaterElement(nums1, nums2);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
