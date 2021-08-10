public class FactorialTrailingZeroes {
    public int trailingZeroes(int n){
        if(n == 0){
            return 0;
        }
//        int ret = n;
//        while(n > 1){
//            n--;
//            ret *= n;
//        }
//        System.out.println(ret);
        //这个方法int不能存储那么大的数据，
        //用巧妙方法，看有几个5，25是5的平方，有两个5，10里面有一个5，
        int res = 0;
        for(int i = 0; i <= n; i += 5){
            int current = 0;
            int I = i;
            while(I > 0){
                if(I % 5 != 0){
                    break;
                }
                else {
                    current++;
                }
                I /= 5;
            }
            res += current;
        }
        return res;
    }

    public static void main(String[] args){
        FactorialTrailingZeroes factorialTrailingZeroes =
                new FactorialTrailingZeroes();
        int n = 30;
        int ret = factorialTrailingZeroes.trailingZeroes(n);
        System.out.println(ret);
    }
}
