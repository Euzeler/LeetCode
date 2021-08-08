public class Reverse {
    public int reverse(int x){
        long res = 0;
//        while (x != 0){
//            res += x % 10;
//            x = x / 10;
//            res *= 10;
//        }
//        res /= 10;
        while (x != 0){
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE){
            return 0;
        } else {
            return (int)res;
        }
    }

    public static void main(String[] args){
        Reverse re = new Reverse();
        int result = re.reverse(595984846);
        System.out.println(result);
    }
}
