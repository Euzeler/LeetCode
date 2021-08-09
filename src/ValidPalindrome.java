import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        String s1 = s.replaceAll(" ", "");
        String s2 = s1.replaceAll("\\pP", "");
//        String s2_1 = s2.replaceAll("\\d+", "");
        String s2_2 = s2.replaceAll("`", "");
        String s3 = s2_2.toLowerCase(Locale.ROOT);
        System.out.println(s3);
        if(s3.isEmpty()){
            return true;
        }
        for(int i = 0; i <= (s3.length() - 1) / 2; i++){
            if(s3.charAt(i) != s3.charAt(s3.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "0P";
        boolean res = validPalindrome.isPalindrome(s);
        System.out.println(res);
    }
}
