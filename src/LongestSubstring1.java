import java.util.HashMap;

public class LongestSubstring1 {
    public int lengthOfLongestSubstring(String s){
        //优化一下，这个优化反倒变慢了，因为要循环的更多了
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        int tmp = 0;
        //这里有一个i++，所以
        for(int i = 0; i < s.length(); i++){
            if(!hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i), i);
                tmp++;
                max = Math.max(max, tmp);
            }
            else{
                //所以这里就减tmp就行了
                i = hashMap.get(s.charAt(i));
                hashMap.clear();
                tmp = 0;
            }
        }
        return max;
    }

    public static void main(String[] args){
        String s = "aab";
        LongestSubstring1 longestSubstring = new LongestSubstring1();
        int ret = longestSubstring.lengthOfLongestSubstring(s);
        System.out.println(ret);
    }
}
// aab, dvdf, abcabcbb,