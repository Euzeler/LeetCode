public class FactorialTrailingZeroes1 {
    public int trailingZeroes(int n){
        if(n == 0){
            return 0;
        }
        int res = 0;
        //更快的方法，也是数5的个数，但是，思考一下，在1-24的时候，/5的结果就是几个5，
        //在25的时候，/5的结果还要再加上1个5，也就是再除一下5就行了
        while(n > 0){
            n /= 5;
            res += n;
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
