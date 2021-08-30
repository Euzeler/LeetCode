public class ShortestDistance_821 {
    public int[] shortestToChar(String s, char c){
        int[] ret = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) ret[i] = 0;
            int l = i, r = i;
            while(l >= 0 || r < s.length()){
                if(s.charAt(l) == c) {
                    ret[i] = i - l;
                    break;
                }
                if(s.charAt(r) == c){
                    ret[i] = r - i;
                    break;
                }
                if(s.charAt(r) != c && s.charAt(l) != c){
                    if(l - 1 >= 0) l--;
                    if(r + 1 < s.length()) r++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args){
        String s = "aaab";
        char c = 'b';
        ShortestDistance_821 sh = new ShortestDistance_821();
        int[] ret = sh.shortestToChar(s, c);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
