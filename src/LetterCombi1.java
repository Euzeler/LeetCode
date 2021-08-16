import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LetterCombi1 {
    String[] alpha = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits){
        List<String> ret = new LinkedList<>();
        if(digits.length() == 0) return ret;


        ret.add("");
        for(int i = 0; i < digits.length(); i++){
            ret = addOneDigit(digits.charAt(i), ret);
        }
        return ret;
    }

    //重点在于这个方法，迭代，在不知道到底要加几次的情况下，一次一次地加，
    public List<String> addOneDigit(Character digit, List<String> pre){
        List<String> ret = new LinkedList<>();
        for(int i = 0; i < alpha[digit - '0'].length(); i++){
            for(String x : pre){
                ret.add(x + alpha[digit - '0'].charAt(i));
            }
        }
        return ret;
    }

    public static void main(String[] args){
        LetterCombi1 letterCombi = new LetterCombi1();
        String digits = "2";
        List<String> ret = letterCombi.letterCombinations(digits);
        System.out.println(ret);
    }
}
