public class Base7 {
    public String convertToBase7(int num){
        if(num == 0) return "0";
        int numAbs = Math.abs(num);
        StringBuilder ret = new StringBuilder();
        while(numAbs > 0){
            ret.insert(0, numAbs % 7);
            numAbs /= 7;
        }
        if(num < 0){
            ret.insert(0, "-");
        }
        String ret1 = ret.toString();
        return ret1;
    }

    public static void main(String[] args){
        Base7 b = new Base7();
        int num = -7;
        String ret = b.convertToBase7(num);
        System.out.println(ret);
    }
}
