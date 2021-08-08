public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        //第一个数组暂存到nums3
        int[] nums3 = new int[m];
        for(int i = 0; i < m; i++){
            nums3[i] = nums1[i];
        }
        int j = 0;
        int k = 0;
        for(int i = 0; i < nums1.length; i++){
            if(j < m && k < n && nums3[j] < nums2[k]){
                nums1[i] = nums3[j];
                j++;
            }
            else if(j < m && k < n && nums3[j] >= nums2[k]){
                nums1[i] = nums2[k];
                k++;
            }
            else if(j < m && k == n){
                nums1[i] = nums3[j];
                j++;
            }
            else if(j == m && k < n){
                nums1[i] = nums2[k];
                k++;
            }
        }
    }

    public static void main(String[] args){
        MergeSortedArrays merge = new MergeSortedArrays();
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge.merge(nums1, 0, nums2, 1);
        for(int i = 0; i < nums1.length; i++){
            System.out.println(nums1[i]);
        }
    }
}
