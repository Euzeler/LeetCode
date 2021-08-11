import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        HashMap<Character, Character> hashMap1 = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            if(hashMap.get(s.charAt(i)) == null && hashMap1.get(t.charAt(i)) == null){
                hashMap.put(s.charAt(i), t.charAt(i));
                hashMap1.put(t.charAt(i), s.charAt(i));
            }
            else{
                if(hashMap.get(s.charAt(i)) == null || hashMap1.get(t.charAt(i)) == null){
                    return false;
                }
                else if(hashMap.get(s.charAt(i)) != t.charAt(i) || hashMap1.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "egg";
        String t = "add";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        boolean ret = isomorphicStrings.isIsomorphic(s, t);
        System.out.println(ret);
    }
}
