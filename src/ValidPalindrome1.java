import java.util.Locale;

public class ValidPalindrome1 {
    public boolean isPalindrome(String s){
        //方法二的思路我有一个苗头，但是没有他考虑地那么周全
        s = s.toLowerCase(Locale.ROOT);
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            int a = (int) s.charAt(i);
            int b = (int) s.charAt(j);

            if(!isRight(a)){
                i++;
            }
            else if(!isRight(b)){
                j--;
            }
            else{
                if(a != b){
                    return false;
                }
                //少了这两句
                i++;
                j--;
            }
        }
        return true;
    }

    //把char改成int可以提高速度噢，当然上面也要改，这是问题的核心所在
    public boolean isRight(int a){
        return a >= 48 && a <= 57 || a >= 97 && a <= 122;
    }

    public static void main(String[] args){
        ValidPalindrome1 validPalindrome1 = new ValidPalindrome1();
        String s = "0P";
        boolean res = validPalindrome1.isPalindrome(s);
        System.out.println(res);
    }
}
