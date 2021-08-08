public class AddBinary1 {
    public String addBinary(String a, String b){
        int lenA = a.length();
        int lenB = b.length();
        int lenSum = Math.max(lenA, lenB);
        int sum = 0;
        int carry = 0;
        StringBuilder tmpRes = new StringBuilder();
        for(int i = 0; i < lenSum; i++){
            if((lenA - 1 - i) >= 0){
                //这里如果记不住0和1的ascⅡ码，就写成'0'
                sum += a.charAt(lenA - 1 - i) - '0';
            }
            if((lenB - 1 - i) >= 0){
                sum += b.charAt(lenB - 1 - i) - 48;
            }
            sum += carry;
            tmpRes.append(sum % 2);
            carry = sum / 2;
            sum = 0;
        }
        if(carry == 1){
            tmpRes.append(1);
        }
        String res = tmpRes.reverse().toString();
        return res;
    }

    public static void main(String[] args){
        AddBinary1 add = new AddBinary1();
        String a = "1010";
        String b = "1100";
        String res = add.addBinary(a, b);
        System.out.println(res);
    }
}
