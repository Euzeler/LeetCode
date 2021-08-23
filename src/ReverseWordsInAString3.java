public class ReverseWordsInAString3 {
    public String reverseWords(String s){
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++){
            String tmp = str[i];
            StringBuilder tmp1 = new StringBuilder();
            for(int j = 0; j < str[i].length(); j++){
                tmp1.append(tmp.charAt(str[i].length() - 1 - j));
            }
            str[i] = tmp1.toString();
        }
        StringBuilder ret = new StringBuilder();
        ret.append(str[0]);
        for(int i = 1; i < str.length; i++){
            ret.append(" " + str[i]);
        }
        return ret.toString();
    }

    public static void main(String[] args){
        ReverseWordsInAString3 r = new ReverseWordsInAString3();
        String s = "Let's take LeetCode contest";
        String ret = r.reverseWords(s);
        System.out.println(ret);
    }
}
