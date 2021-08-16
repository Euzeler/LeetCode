import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LetterCombi {
    public List<String> letterCombinations(String digits){
        char[] digitsArrTmp = digits.toCharArray();
        char[] digitsArr = new char[4];
        for(int i = 0; i < digitsArr.length; i++){
            if(i < digitsArrTmp.length){
                digitsArr[i] = digitsArrTmp[i];
            }
            else digitsArr[i] = 0;
        }
//        for(int i = 0; i < digitsArr.length; i++){
//            System.out.println("测试：" + digitsArr[i]);
//        }

        List<String> ret = new LinkedList<>();
        String[][] alpha = {{}, {}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"},
                {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r", "s"},
                {"t", "u", "v"}, {"w", "x", "y", "z"}};



        for (int i = 0; i < alpha[digitsArr[0] - '1'].length; i++) {
            StringBuilder s = new StringBuilder();
            s.append(alpha[digitsArr[0] - '1'][i]);
            for(int j = 0; j < alpha[digitsArr[1] - '1'].length; j++) {
                s.append(alpha[digitsArr[1] - '1'][j]);
                for (int k = 0; k < alpha[digitsArr[2] - '1'].length; k++) {
                    s.append(alpha[digitsArr[2] - '1'][k]);
                    for (int m = 0; m < alpha[digitsArr[3] - '1'].length; m++) {
                        s.append(alpha[digitsArr[3] - '1'][m]);
                    }
                }
            }
            ret.add(s.toString());
        }

        //数字的循环
//        for(int i = 0; i < digits.length(); i++){
//            StringBuffer s = new StringBuffer();
//            //digits.charAt(i) - 2;
//            int len = alpha[(int)(digits.charAt(i) - '2')].length;
//            //数字所能够代表的字母的循环
//            for(int j = 0; j < len; j++){
//                s.append(alpha[digits.charAt(i) - '2'][j]);
//            }
//            ret.add(s.toString());
//        }
//        System.out.println(ret.get(0).charAt(0));
//        List<String> ret1 = new LinkedList<>();
//        for(int i = 0; i < ret.get(0).length(); i++){
//
//        }
        return ret;
    }

    public static void main(String[] args){
        LetterCombi letterCombi = new LetterCombi();
        String digits = "2345";
        List<String> ret = letterCombi.letterCombinations(digits);
        System.out.println(ret);
    }
}
