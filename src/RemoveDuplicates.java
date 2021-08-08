public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
//        int result = 0;
//        for(int i = 0; i < nums.length - 1; i++){
//            if(nums[i] != nums[i + 1]){
//                result++;
//            }
//        }
//        result++;
//        //我这样移动的话，当出现很多个连续相同的话，就不行了，例如：-3,-1,-1,0,0,0,0,0,2
//        for(int k = 1; k < nums.length - 1; k++){
//            if(nums[k] == nums[k - 1]){
//                for(int j = k - 1; j < nums.length - 1; j++){
//                    nums[j] = nums[j + 1];
//                }
//            }
//        }
//        for(int k = 0; k < nums.length - 1; k++){
//            if(nums[k] == nums[k + 1]){
//                for(int j = k; j < nums.length - 1; j++){
//                    nums[j] = nums[j + 1];
//                }
//            }
//        }
//        //清除后面的几个非结果项
//        for(int i = result; i < nums.length; i++){
//            nums[i] = 0;
//        }
//        return result;

        int index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] a = {-3,-1,-1,0,0,0,0,0,2};
        RemoveDuplicates r = new RemoveDuplicates();
        int k = r.removeDuplicates(a);
        System.out.println("k = " + k);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

//0,1

//-3,-1,-1,0,0,0,0,0,2

//        int idx = 1;
//        for (int i = 1; i < nums.length; i++){
//            if(nums[i] != nums[i-1]){
//                nums[idx] = nums[i];
//                idx++;
//            }
//        }
//        return idx;