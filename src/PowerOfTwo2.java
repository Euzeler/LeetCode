import java.util.HashMap;

public class PowerOfTwo2 {
    //上一个方法速度慢，我又想到了找质数的那一招
    public boolean isPowerOfTwo(int n){
        HashMap<Long, Boolean> hashMap = new HashMap<>();
        if(n <= 0){
            return false;
        }
        boolean ret = false;
        //没有这么大的数组可以分配给我，那就用hash呗
        for(long i = 1; i < Math.pow(2, 31); i *= 2){
            hashMap.put(i, true);
        }
        if(hashMap.containsKey((long)n)){
            ret = true;
        }
        return ret;
    }

    public static void main(String[] args){
        PowerOfTwo2 powerOfTwo = new PowerOfTwo2();
        int n = 1;
        boolean ret = powerOfTwo.isPowerOfTwo(n);
        System.out.println(ret);
    }
}
