public class PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        boolean ret = true;
        int count = 0;
        while(n > 0){
            if(n % 2 == 1){
                count++;
            }
            if(count > 1){
                ret = false;
                break;
            }
            n /= 2;
        }
        return ret;
    }

    public static void main(String[] args){
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        int n = 3;
        boolean ret = powerOfTwo.isPowerOfTwo(n);
        System.out.println(ret);
    }
}
