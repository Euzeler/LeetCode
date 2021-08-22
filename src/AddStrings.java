public class AddStrings {
    public String addStrings(String num1, String num2){
        StringBuilder s = new StringBuilder();
        StringBuilder num1Reverse = new StringBuilder();
        StringBuilder num2Reverse = new StringBuilder();
        System.out.println(num1Reverse);
        for(int i = 0; i < num1.length(); i++){
            num1Reverse.append(num1.charAt(num1.length() - 1 - i));
        }
        for(int i = 0; i < num2.length(); i++){
            num2Reverse.append(num2.charAt(num2.length() - 1 - i));
        }
        System.out.println("测试：" + num1Reverse);
        System.out.println("测试：" + num2Reverse);
        int carry = 0;
        int minLen = Math.min(num1.length(), num2.length());
        int maxLen = Math.max(num1.length(), num2.length());
        for(int i = 0; i < minLen; i++){
            int sum = num1Reverse.charAt(i) + num2Reverse.charAt(i) + carry - 96;
            if(sum >= 10) {
                s.append(sum - 10);
                carry = 1;
            }
            else{
                s.append(sum);
                carry = 0;
            }
        }
        System.out.println("进位是：" + carry);
        for(int i = minLen; i < maxLen; i++){
            int sum = 0;
            if(num1.length() < num2.length()){
                sum = num2Reverse.charAt(i) + carry - 48;
            }
            else if(num1.length() > num2.length()){
                sum = num1Reverse.charAt(i) + carry - 48;
            }
            if(sum >= 10) {
                s.append(sum - 10);
                carry = 1;
            }
            else{
                s.append(sum);
                carry = 0;
            }
        }
        if(carry == 1) {
            s.append(carry);
        }
        String ret = s.reverse().toString();
        System.out.println("测试：" + ret);
        return null;
    }

    public static void main(String[] args){
        AddStrings a = new AddStrings();
        String num1 = "99";
        String num2 = "9";
        String ret = a.addStrings(num1, num2);
        System.out.println(ret);
    }
}
