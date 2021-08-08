public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        int res = 0;
        int tail = s.length();
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == 32){
                tail--;
            }
            else break;
        }
        for(int i = tail - 1; i >= 0 ; i--){
            if((s.charAt(i) - 32) != 0){
                res++;
            }
            else break;
        }
        return res;
    }

    public static void main(String[] args){
        LengthOfLastWord l = new LengthOfLastWord();
        String s = "hello world  ";
        int res = 0;
        res = l.lengthOfLastWord(s);
        System.out.println(res);
    }
}
