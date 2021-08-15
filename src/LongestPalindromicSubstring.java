public class LongestPalindromicSubstring {
    int lo, maxLen;
    public String longestPalindrome(String s){
        //i,j 指针和 isPalindrome 在这里不适用，

        if(s.length() == 1){
            return s;
        }
        for(int i = 0; i < s.length() - 1; i++){
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        String ret = s.substring(lo, maxLen + lo);
        return ret;
    }

    public void extendPalindrome(String s, int j, int k){
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            //尝试性地减一减，如果不满足了，就跳出了，所以
            j--;
            k++;
        }
        j++;
        k--;
        //

        //这里是记住的，但是是为什么呢
        //因为上面的--是预减，所以长度应该是(k - j + 1) - 2，并且也应该从(j + 1)开始，
        //因此改成这样更好理解
        if(maxLen < k - j + 1){
            //maxLen就是长度，
            maxLen = k - j + 1;
            lo = j;
        }
    }

    public static void main(String[] args){
        String s = "cbbd";
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        String ret = l.longestPalindrome(s);
        System.out.println(ret);
        //这个函数理解错误
        System.out.println(s.substring(1, 2));
    }
}

//cbbd, babad,
