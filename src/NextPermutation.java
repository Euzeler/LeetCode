import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums){
        //把这个树改成仅大一点的数字，如果已经是最大的了，那么就改成最小的

        //如果是降序的话，就排一个序
        //复制备份
        int[] nums1 = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums1[i] = nums[i];
        }
        //reverse
        int[] nums2 = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums2[i] = nums[nums.length - 1 - i];
        }
        Arrays.sort(nums1);
        boolean isDecrease = true;
        for(int i = 0; i < nums1.length; i++){
            if(nums2[i] == nums1[i]){
                continue;
            }
            else {
                isDecrease = false;
                break;
            }
        }
        if(isDecrease == true){
            for(int i = 0; i < nums.length; i++){
                nums[i] = nums1[i];
            }
        }
        else {

            //如果不是单调递减的，那么肯定可以找到最后一个上升的两个数字，swap他们即可
            //先reverse,
            for(int i = 0; i < nums.length - 1; i++){
                if(nums2[i] > nums2[i + 1]){
                    int tmp = nums2[i];
                    nums2[i] = nums2[i + 1];
                    nums2[i + 1] = tmp;
                    break;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums2[nums.length - 1 - i];
            }
        }
    }

    public static void main(String[] args){
        NextPermutation n = new NextPermutation();
        int[] arr = {1,3,2};
        n.nextPermutation(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println("结果： " + arr[i]);
        }
        //初步154个testcase
    }
}
