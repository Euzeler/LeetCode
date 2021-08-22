public class AddStrings1 {
    public String addStrings(String num1, String num2){
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        StringBuilder s = new StringBuilder();
        while(i >= 0 || j >= 0){
            //carry要记得加进来啊，
            int sum = carry;
            //if条件的问题啊，
            if(i >= 0){
                sum += num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += num2.charAt(j) - '0';
                j--;
            }
            carry = sum / 10;
            s.append(sum % 10);
        }
        if(carry != 0){
            s.append("1");
        }
        String ret = s.reverse().toString();
        return ret;
    }

    public static void main(String[] args){
        AddStrings1 a = new AddStrings1();
        String num1 = "99";
        String num2 = "9";
        String ret = a.addStrings(num1, num2);
        System.out.println(ret);
    }
}
