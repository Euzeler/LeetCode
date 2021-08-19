import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s){
        //这句代码啊，啊呀。害我以为是断点出问题了
        //if(pattern.length() != s.length()) return false;
        HashMap<Character, String> hashMap = new HashMap<>();
        String[] ret = s.split(" ");
//        System.out.println(s);
//        for(String x : ret){
//            System.out.println(x);
//        }

        if(pattern.length() != ret.length) return false;
        //假设s.length和pattern.length是相等的，
        for(int i = 0; i < pattern.length(); i++){
            if(!hashMap.containsKey(pattern.charAt(i)) && !hashMap.containsValue(ret[i])){
                hashMap.put(pattern.charAt(i), ret[i]);
            }
            else{
                //这里很关键啊，String相比较要用equal，不能用!=
                if(!hashMap.containsKey(pattern.charAt(i)) || !hashMap.get(pattern.charAt(i)).equals(ret[i])){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        WordPattern w = new WordPattern();
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean isRight = w.wordPattern(pattern, s);
        System.out.println(isRight);
    }
}
