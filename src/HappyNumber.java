import java.util.HashMap;

public class HappyNumber {
    public boolean isHappy(int n){
        boolean ret = false;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while(true) {
            int value = 0;
            while (n > 0) {
                value += Math.pow(n % 10, 2);
                n /= 10;
            }
            if(value == 1){
                ret = true;
                break;
            }
            if(hashMap.get(value) == null){
                hashMap.put(value, 1);
            }
            else if(hashMap.get(value) == 1){
                ret = false;
                break;
            }
            n = value;
        }
        return ret;
    }

    public static void main(String[] args){
        HappyNumber happyNumber = new HappyNumber();
        int n = 2;
        boolean ret = happyNumber.isHappy(n);
        System.out.println(ret);
    }
}
