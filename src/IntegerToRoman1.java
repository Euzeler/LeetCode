public class IntegerToRoman1 {
    public String intToRoman(int num){

        //这个更快，
        StringBuilder ret = new StringBuilder();
        //先把数字放在数组里面,倒序存放的，高位如果没有就是0，
        int[] nums = new int[4];
        int i = 0;
        while(num > 0){
            nums[i] = num % 10;
            num /= 10;
            i++;
        }
        String[] roman0 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] roman1 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] roman2 = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] roman3 = {"", "M", "MM", "MMM"};
        ret.insert(0, roman0[nums[0]]).insert(0, roman1[nums[1]]).
                insert(0, roman2[nums[2]]).insert(0, roman3[nums[3]]);
        return ret.toString();
    }

    public static void main(String[] args){
        IntegerToRoman i = new IntegerToRoman();
        int num = 1994;
        String ret = i.intToRoman(num);
        System.out.println(ret);
    }
}
