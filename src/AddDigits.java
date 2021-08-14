public class AddDigits {
    public int addDigits(int num){
        while(num >= 10){
            num = oneProcess(num);
        }
        return num;
    }

    private int oneProcess(int num){
        int ret0 = 0;
        while(num > 0){
            ret0 += num % 10;
            num /= 10;
        }
        return ret0;
    }

    public static void main(String[] args){
        AddDigits addDigits = new AddDigits();
        int ret = addDigits.addDigits(10);
        System.out.println(ret);
    }
}
