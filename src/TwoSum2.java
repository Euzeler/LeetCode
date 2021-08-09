public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target){
        int[] res = new int[2];
        int i = 0;
        int j = 0;
        boolean flag = false;
        while(i < numbers.length && flag == false){
            if(numbers[i] > target){
                i++;
            }
            j = i + 1;
            while(j < numbers.length){
                if(numbers[i] + numbers[j] != target){
                    j++;
                }
                else {
                    flag = true;
                    break;
                }
            }
            //用while的时候不要忘记自己++，同时注意++的位置
            i++;
        }
        res[0] = i;
        res[1] = j + 1;
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
