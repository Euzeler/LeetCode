import java.math.BigInteger;

public class PlusOne {
    public int[] plusOne(int[] digits){
        //过度简化
//        digits[digits.length - 1]++;
//        return digits;
        //陷入使用大数的陷阱
//        BigInteger sum = new BigInteger("1");
//        int n = 1;
//        for(int i = digits.length - 1; i >= 0; i--){
//            sum.add(digits[i] * n);
//            n *= 10;
//        }
//        //判断结果是一个几位的数字
//        int weishu = 0;
//        int sum1 = sum;
//        while(sum1 > 0){
//            sum1 /= 10;
//            weishu++;
//        }
//        int[] res = new int[weishu];
//        for(int i = weishu - 1; i >= 0; i--){
//            res[i] = sum % 10;
//            sum /= 10;
//        }
//        return res;
        //利用数组来实现
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;

            }
            else {
                digits[i] = 0;
                if(digits[0] == 0){
                    int[] arr = new int[digits.length + 1];
                    arr[0] = 1;
                    return arr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        PlusOne p = new PlusOne();
        int[] digits = {9, 9};
        int[] res = p.plusOne(digits);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }

    }
}
