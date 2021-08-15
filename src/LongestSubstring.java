import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> hashSet = new HashSet<>();
        int max = 0;
        int tmp = 0;
        //这里有一个i++，所以
        for(int i = 0; i < s.length(); i++){
            if(!hashSet.contains(s.charAt(i))){
                hashSet.add(s.charAt(i));
                tmp++;
                max = Math.max(max, tmp);
            }
            else{
                hashSet.clear();
                //所以这里就减tmp就行了
                i = i - tmp;
                tmp = 0;
            }
        }
        return max;
    }

    public static void main(String[] args){
        String s = "abcabcbb";
        LongestSubstring longestSubstring = new LongestSubstring();
        int ret = longestSubstring.lengthOfLongestSubstring(s);
        System.out.println(ret);
    }
}
// aab, dvdf, abcabcbb,