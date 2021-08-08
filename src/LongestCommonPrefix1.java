public class LongestCommonPrefix1 {
    public String longestCommonPrefix1(String[] strs, int left, int right){
        if(strs.length == 0 || strs == null){
            return "";
        }
        //算出最小的字符串的长度
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++){
            if(strs[i].length() < minLen){
                minLen = strs[i].length();
            }
        }
        minLen = Math.min(minLen, Integer.MAX_VALUE);
        //这样写的话，直接输入一个"a"就是错的。
        //left = 0;
        //right = minLen - 1;
        left = 1;
        right = minLen;
        //二分查找的又一种写法，
        while(left <= right){
            int middle = (left + right) / 2;
            if(isCommonPrefix(strs, middle)){
                left = middle + 1;
            }
            else right = middle - 1;
        }
        return strs[0].substring(0, (left + right) / 2);
    }

    boolean isCommonPrefix(String[] strs, int len){
        String prefix = strs[0].substring(0, len);
        for(int i = 0; i < strs.length; i++){
            if(!strs[i].startsWith(prefix)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] strs = {"f"};
        LongestCommonPrefix1 l = new LongestCommonPrefix1();
        String result = l.longestCommonPrefix1(strs, 0, strs.length);
        //有时候，不出结果也要看一下输出的这一段是咋样写的！
        System.out.println(result);
    }
}
