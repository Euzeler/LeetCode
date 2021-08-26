public class ValidPalindrome2_1 {
    public boolean validPalindrome(String s){
        boolean ret1 = true;
        ret1 = isPalindrome(s, 0, s.length() - 1, true);
        return ret1;
    }

    public boolean isPalindrome(final String s, int left, int right, final boolean canDeleted){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                if(canDeleted == false){
                    return false;
                }
                else return isPalindrome(s, left + 1, right, false) ||
                        isPalindrome(s, left, right - 1, false);
            }

            left++;
            right--;
        }
        return true;
    }

//    public boolean validPalindrome(String s) {
//        return isPalindrome(s, 0, s.length() - 1, false);
//    }
//
//    public boolean isPalindrome(final String s, int leftIndex, int rightIndex, final boolean isCharacterDeleted){
//
//        while(leftIndex < rightIndex){
//
//            if(s.charAt(leftIndex) != s.charAt(rightIndex)){
//                if(isCharacterDeleted)
//                    return false;
//
//                // isPalindrome(s, leftIndex + 1, rightIndex, true) for cases like "ececabbacec"
//                // isPalindrome(s, leftIndex, rightIndex - 1, true) for cases like "abccbab"
//                return isPalindrome(s, leftIndex + 1, rightIndex, true) || isPalindrome(s, leftIndex, rightIndex - 1, true);
//            }
//
//            leftIndex++;
//            rightIndex--;
//
//        }
//
//        return true;
//    }

    public static void main(String[] args){
        ValidPalindrome2_1 valid = new ValidPalindrome2_1();
        String s = "abc";
        boolean ret = valid.validPalindrome(s);
        System.out.println(ret);
    }
}

//"cupuuupucu"他妈这也可以删，这不是折腾人嘛。
