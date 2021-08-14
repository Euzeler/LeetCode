public class UglyNumber {
    public boolean isUgly(int n){
        if(n <= 0){
            return false;
        }
        while(n > 0){
            if(n % 2 == 0){
                n /= 2;
                continue;
            }
            if(n % 3 == 0){
                n /= 3;
                continue;
            }
            if(n % 5 == 0){
                n /= 5;
                continue;
            }
            break;
        }
        if(n == 1){
            return true;
        }
        else return false;
    }

    public static void main(String[] args){
        UglyNumber uglyNumber = new UglyNumber();
        boolean ret = uglyNumber.isUgly(6);
        System.out.println(ret);
    }
}
