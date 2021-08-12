public class PowerOfTwo1 {
    //上一个方法速度慢，我又想到了找质数的那一招
    public boolean isPowerOfTwo(int n){
//        if(n <= 0){
//            return false;
//        }
//        //没有这么大的数组可以分配给我，那就用hash呗
//        boolean[] isRight = new boolean[(int) (Math.pow(2, 31) - 1)];
//        isRight[0] = false;
//        isRight[1] = true;
//        for(int i = 2; i < isRight.length; i *= 2){
//            isRight[i] = true;
//        }
//        return isRight[n];
        return false;
    }

    public static void main(String[] args){
        PowerOfTwo1 powerOfTwo = new PowerOfTwo1();
        int n = 3;
        boolean ret = powerOfTwo.isPowerOfTwo(n);
        System.out.println(ret);
    }
}
