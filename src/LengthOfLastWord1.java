public class LengthOfLastWord1 {
    public int lengthOfLastWord(String s){
        int res = 0;
        //trim()方法，用于删除字符串的头尾空白符。
        String s1 = s.trim();
        for(int i = s1.length() - 1; i >= 0 ; i--){
            if((s1.charAt(i) - 32) != 0){
                res++;
            }
            else break;
        }
        return res;
    }

    public static void main(String[] args){
        LengthOfLastWord1 l = new LengthOfLastWord1();
        String s = "hello world  ";
        int res = 0;
        res = l.lengthOfLastWord(s);
        System.out.println(res);
    }
}
