public class ReverseString {
    public void reverseString(char[] s){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length; i++){
            stringBuilder.append(s[s.length - i - 1]);
        }
        String ret = stringBuilder.toString();
        //System.out.println(ret);
        for(int i = 0; i < s.length; i++){
            s[i] = ret.charAt(i);
        }
    }

    public static void main(String[] args){
        ReverseString r = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        r.reverseString(s);
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}
