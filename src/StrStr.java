public class StrStr {
    public int strStr(String haystack, String needle){
        if(haystack.equalsIgnoreCase(needle) || needle.isEmpty()){
            return 0;
        }
        int res = -1;
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
                if(j == needle.length() - 1) {
                    res = i;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        StrStr s = new StrStr();
        int res = s.strStr("aaa", "a");
        System.out.println(res);

    }
}
