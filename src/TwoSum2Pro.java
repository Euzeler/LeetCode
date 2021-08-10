public class TwoSum2Pro {
    public int[] twoSum(int[] numbers, int target){
        int[] res = new int[2];
        if(numbers == null || numbers.length < 2){
            return res;
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            if(numbers[left] + numbers[right] == target){
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
            if(numbers[left] + numbers[right] < target){
                left++;
            }
            else {
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args){
        TwoSum2 twoSum2 = new TwoSum2();
        int[] numbers = {2, 7, 11, 5};
        int[] res = twoSum2.twoSum(numbers, 9);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
