import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine){

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if(hashmap.containsKey(magazine.charAt(i))){
                hashmap.put(magazine.charAt(i), hashmap.get(magazine.charAt(i)) + 1);
            }
            else{
                hashmap.put(magazine.charAt(i), 1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++){
            if(!hashmap.containsKey(ransomNote.charAt(i)) || hashmap.get(ransomNote.charAt(i)) == 0){
                return false;
            }
            else{
                hashmap.put(ransomNote.charAt(i), hashmap.get(ransomNote.charAt(i)) - 1);
            }
        }
        return true;
    }

    public static void main(String[] args){

    }
}
