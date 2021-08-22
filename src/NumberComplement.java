public class NumberComplement {
    public int findComplement(int num){
        int ret = 0;
        int mul = 1;
        while(num > 0){
            int tmp = (num & 1) ^ 1;
            ret += tmp * mul;
            mul *= 2;
            num = num >> 1;
        }
        return ret;
    }

    public static void main(String[] args){
        NumberComplement n = new NumberComplement();
        int num = 5;
        int ret = n.findComplement(num);
        System.out.println(ret);
    }
}
