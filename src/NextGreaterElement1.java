public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        for(int i = 0; i < nums1.length; i++){
            int tmp = nums1[i];
            boolean isFind = false;
            for(int j = 0; j < nums2.length; j++){
                if(tmp == nums2[j]){
                    int I = j;
                    for(int k = I + 1; k < nums2.length; k++){
                        if(nums2[k] > tmp){
                            nums1[i] = nums2[k];
                            isFind = true;
                            break;
                        }
                    }
                }
            }
            if(isFind == false){
                nums1[i] = -1;
            }
        }
        return nums1;
    }

    public static void main(String[] args){
        NextGreaterElement1 n = new NextGreaterElement1();
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        int[] ret = n.nextGreaterElement(nums1, nums2);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
