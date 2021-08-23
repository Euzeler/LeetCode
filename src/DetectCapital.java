public class DetectCapital {
    public boolean detectCapitalUse(String word){
        if(word.length() == 1) return true;
        else if(word.length() == 2) {
            if(word.charAt(0) <= 'z' && word.charAt(0) >= 'a' &&
            word.charAt(1) <= 'z' && word.charAt(1) >= 'a'){
                return true;
            }
            else if(word.charAt(0) <= 'Z' && word.charAt(0) >= 'A' &&
                    word.charAt(1) <= 'Z' && word.charAt(1) >= 'A'){
                return true;
            }
            else if(word.charAt(0) <= 'Z' && word.charAt(0) >= 'A' &&
                    word.charAt(1) <= 'z' && word.charAt(1) >= 'a'){
                return true;
            }
        }
        else{
            if(word.charAt(0) <= 'z' && word.charAt(0) >= 'a'){
                for(int i = 1; i < word.length(); i++){
                    if(word.charAt(i) <= 'z' && word.charAt(i) >= 'a'){
                        if(i == word.length() - 1){
                            return true;
                        }
                        continue;
                    }
                    else break;
                }
            }
            else {
                if (word.charAt(1) <= 'z' && word.charAt(1) >= 'a') {
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) <= 'z' && word.charAt(i) >= 'a') {
                            if (i == word.length() - 1) {
                                return true;
                            }
                            continue;
                        }
                        else break;
                    }
                } else {
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) <= 'Z' && word.charAt(i) >= 'A') {
                            if (i == word.length() - 1) {
                                return true;
                            }
                            continue;
                        }
                        else break;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        DetectCapital d = new DetectCapital();
        String word = "LeeTCode";
        boolean ret = d.detectCapitalUse(word);
        System.out.println(ret);
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(3) > 'a');
    }
}
