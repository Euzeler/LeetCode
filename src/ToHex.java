public class ToHex {
    public String toHex(int num) {
        //输入的是int,32位，所以输出的是8个16进制数
        StringBuilder ret = new StringBuilder();
        String[] hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        if(num >= 0) {
            while (num > 15) {
                ret.insert(0, hex[num % 16]);
                num /= 16;
            }
            ret.insert(0, hex[num]);
        }
        else{
            num = (num + 1) * (-1);
            while(num > 0){
                ret.insert(0, hex[15 - (num % 16)]);
                num /= 16;
            }
            while(ret.length() < 8){
                ret.insert(0, "f");
            }
        }
        String ret1 = ret.toString();
        return ret1;
    }

    public static void main(String[] args){
        int num = -2;
        ToHex to = new ToHex();
        String ret = to.toHex(num);
        System.out.println(ret);
    }
}
