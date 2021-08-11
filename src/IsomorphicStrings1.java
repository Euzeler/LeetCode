import java.util.HashMap;

public class IsomorphicStrings1 {
    public boolean isIsomorphic(String s, String t){
        if(s == "" || s.length() < 1){
            return false;
        }
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            if(hashMap.containsKey(s.charAt(i))){
                if(hashMap.get(s.charAt(i)) == t.charAt(i)){
                    continue;
                }
                else {
                    return false;
                }
            }
            else{
                if(hashMap.containsValue(t.charAt(i))){
                    return false;
                }
                hashMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "badc";
        String t = "baba";
        IsomorphicStrings1 isomorphicStrings = new IsomorphicStrings1();
        boolean ret = isomorphicStrings.isIsomorphic(s, t);
        System.out.println(ret);
    }
}
