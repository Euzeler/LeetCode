public class ValidPalindrome2 {
    public boolean validPalindrome(String s){
        boolean ret1 = true;
        int l = 0, r = s.length() - 1;
        int canDelete = 1;
        while(l <= r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else if(canDelete == 1 && s.charAt(l) == s.charAt(r - 1)){
                canDelete = 0;
                l++;
                r--;
                r--;
            }
            else if(canDelete == 1 && s.charAt(l + 1) == s.charAt(r)){
                canDelete = 0;
                l++;
                l++;
                r--;
            }

            else if(canDelete == 1 && l + 1 == r){
                return true;
            }
            else {
                ret1 = false;
                break;
            }
        }

        boolean ret2 = true;
        l = 0;
        r = s.length() - 1;
        canDelete = 1;
        while(l <= r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else if(canDelete == 1 && s.charAt(l + 1) == s.charAt(r)){
                canDelete = 0;
                l++;
                l++;
                r--;
            }
            else if(canDelete == 1 && s.charAt(l) == s.charAt(r - 1)){
                canDelete = 0;
                l++;
                r--;
                r--;
            }
            else if(canDelete == 1 && l + 1 == r){
                return true;
            }
            else {
                ret2 = false;
                break;
            }
        }

        if(ret1 == false && ret2 == false) return false;
        else return true;
    }

    public static void main(String[] args){
        ValidPalindrome2 valid = new ValidPalindrome2();
        String s = "ebcbbececabbacecbbcbe";
        boolean ret = valid.validPalindrome(s);
        System.out.println(ret);
    }
}

//"cupuuupucu"他妈这也可以删，这不是折腾人嘛。
