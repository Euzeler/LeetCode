public class FibonacciNumber1 {
    public int fib(int n){
        //递归慢？用数组吧。
        //哇哦，这提升好呀。
        int[] fib = new int[31];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < fib.length; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args){
        FibonacciNumber f = new FibonacciNumber();
        int n = 2;
        int ret = f.fib(n);
        System.out.println(ret);
    }
}
