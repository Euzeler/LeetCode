import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        //用hash很大的测试用例的情况下会报错，所以用数组就可以的
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            }
            else{
                hashMap.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(hashMap1.containsKey(t.charAt(i))){
                hashMap1.put(t.charAt(i), hashMap1.get(t.charAt(i)) + 1);
            }
            else{
                hashMap1.put(t.charAt(i), 1);
            }
        }
        for(Character key : hashMap.keySet()){
            if(hashMap.get(key) == hashMap1.get(key)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean ret = validAnagram.isAnagram(s, t);
        System.out.println(ret);
    }
}
