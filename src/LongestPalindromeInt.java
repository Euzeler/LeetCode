public class LongestPalindromeInt {
    public int longestPalindrome(String s) {
        int[] alpha = new int[58];
        for(int i = 0; i < s.length(); i++){
            alpha[s.charAt(i) - 65]++;
        }
        int ret = 0;
        boolean changed = false;
        int remainder = 0;
        for(int i = 0; i < alpha.length; i++){
            if(alpha[i] == 2) {
                ret += 2;
                alpha[i] = 0;
            }
            else if(alpha[i] > 2){
                ret += 2 * (alpha[i] / 2);
                alpha[i] = alpha[i] % 2;
            }
        }
        for(int i = 0; i < alpha.length; i++){
            if(alpha[i] == 1){
                ret++;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        LongestPalindromeInt l = new LongestPalindromeInt();
        String s = "bb";
        int ret = l.longestPalindrome(s);
        System.out.println(ret);
    }
}
