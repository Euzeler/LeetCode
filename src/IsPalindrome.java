public class IsPalindrome {
    public boolean isPalindrome(int x){
        boolean bool = false;
        if(x < 0){
            return false;
        }
        int tmp = x;
        int res = 0;
        while(x > 0){
            res = res * 10 + x % 10;
            x /= 10;
        }
        if(res == tmp){
            bool = true;
        }
        return bool;
    }

    public static void main(String[] args){
        int a = 12321;
        IsPalindrome is = new IsPalindrome();
        boolean b = is.isPalindrome(a);
        System.out.println(b);
    }
}
