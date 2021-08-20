import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {
    //这题留着，明天看
    public String multiply(String num1, String num2){
        //200位*200位=
        List<Integer> numOne = new ArrayList<>();
        List<Integer> numTwo = new ArrayList<>();
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < num1.length(); i++){
            numOne.add((int)num1.charAt(num1.length() - 1 - i) - 48);
        }
        System.out.println(numOne);
        for(int i = 0; i < num2.length(); i++){
            numTwo.add((int)num2.charAt(num2.length() - 1 - i) - 48);
        }
        System.out.println(numTwo);
        int carry = 0;
        int minLen = Math.min(numOne.size(), numTwo.size());
        int maxLen = Math.max(numOne.size(), numTwo.size());
        for(int i = 0; i < minLen; i++){
            //ret.
        }

        return null;
    }

    public static void main(String[] args){
        String num1 = "234", num2 = "300500";
        MultiplyStrings m = new MultiplyStrings();
        String ret = m.multiply(num1, num2);
        System.out.println(ret);
        System.out.println(Long.MAX_VALUE);
    }
}
