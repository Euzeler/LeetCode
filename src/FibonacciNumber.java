public class FibonacciNumber {
    public int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args){
        FibonacciNumber f = new FibonacciNumber();
        int n = 2;
        int ret = f.fib(n);
        System.out.println(ret);
    }
}
