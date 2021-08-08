public class AddBinary {
    public String addBinary(String a, String b){
        long decimalA = 0;
        long decimalB = 0;
        String res = "0";
        StringBuilder tempRes = new StringBuilder(10000);
        int N1 = 1;
        int N2 = 1;
        for(int i = a.length() - 1; i >= 0; i--){
            decimalA += (a.charAt(i) - 48) * N1;
            N1 *= 2;
        }
        for(int i = b.length() - 1; i >= 0; i--){
            decimalB += (b.charAt(i) - 48) * N2;
            N2 *= 2;
        }
        System.out.println("decimalA = " + decimalA);
        System.out.println("decimalB = " + decimalB);
        long decimalNum = decimalA + decimalB;
        if(decimalNum == 0){
            res = "0";
            return res;
        }
        while(decimalNum > 0){
            if(decimalNum % 2 == 0){
                tempRes.append("0");
            }
            else tempRes.append("1");
            decimalNum /= 2;
        }
        tempRes.reverse();
        res = tempRes.toString();
        return res;
    }

    public static void main(String[] args){
        AddBinary add = new AddBinary();
        //又是遇到了int类型不够的问题，如果用long也是不够的，所以输入太大了，测试用例，
        //显然又是要用更简单的方法
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String c = add.addBinary(a, b);
        System.out.println("结果是：" + c);
    }
}


