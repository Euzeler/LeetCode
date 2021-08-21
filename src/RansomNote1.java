import java.util.HashMap;

public class RansomNote1 {
    public boolean canConstruct(String ransomNote, String magazine){
        //更快的方法，用数组，
        int[] alpha = new int[26];
        //a的asc码是61
        for(int i = 0; i < magazine.length(); i++){
            alpha[magazine.charAt(i) - 97]++;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            alpha[ransomNote.charAt(i) - 97]--;
        }
        for(int i = 0; i < 26; i++){
            if(alpha[i] < 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){
        StringBuilder ret = new StringBuilder();
        ret.toString();
    }
}
