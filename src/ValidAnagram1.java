public class ValidAnagram1 {
    public boolean isAnagram(String s, String t){
        //其实就是看每个字母的个数是否相同，这个本质抓到了
        int[] Alpha = new int[26];
        for(int i = 0; i < s.length(); i++){
            Alpha[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            Alpha[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < Alpha.length; i++){
            if(Alpha[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        ValidAnagram1 validAnagram = new ValidAnagram1();
        String s = "anagram";
        String t = "nagaram";
        boolean ret = validAnagram.isAnagram(s, t);
        System.out.println(ret);
    }
}
