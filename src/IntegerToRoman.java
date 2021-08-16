public class IntegerToRoman {
    public String intToRoman(int num){

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
        ret.insert(0, roman0[nums[0]]);
        if(nums[1] != 9){
            ret.insert(0, roman0[nums[1]].replaceAll("I", "X").replaceAll("V", "L"));
        }
        else ret.insert(0, "XC");
        if(nums[2] != 9) {
            ret.insert(0, roman0[nums[2]].replaceAll("I", "C").replaceAll("V", "D"));
        }
        else ret.insert(0, "CM");
        ret.insert(0, roman0[nums[3]].replaceAll("I", "M"));
        return ret.toString();
    }

    public static void main(String[] args){
        IntegerToRoman i = new IntegerToRoman();
        int num = 1994;
        String ret = i.intToRoman(num);
        System.out.println(ret);
    }
}
