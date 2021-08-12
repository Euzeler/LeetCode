public class PowerOfTwo3 {
    public boolean isPowerOfTwo(int n){
        //one line solution,用bitCount，不知道有这个方法啊
        return n > 0 && Integer.bitCount(n) == 1;

        //还有一个方法啊，
        // return n > 0 && (n & (n - 1) == 0);
        // 注意括号，要写成 ((n & (n - 1)) == 0)，这样才行。
    }

    public static void main(String[] args){
        PowerOfTwo3 powerOfTwo = new PowerOfTwo3();
        int n = 1;
        boolean ret = powerOfTwo.isPowerOfTwo(n);
        System.out.println(ret);
    }
}
