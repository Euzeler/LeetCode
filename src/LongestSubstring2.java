import java.util.HashSet;

public class LongestSubstring2 {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> hashSet = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while(j < s.length()){
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(max, j - i);
            }
            else{
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args){
        String s = "dvdf";
        LongestSubstring2 longestSubstring = new LongestSubstring2();
        int ret = longestSubstring.lengthOfLongestSubstring(s);
        System.out.println(ret);
    }
}
// aab, dvdf, abcabcbb,