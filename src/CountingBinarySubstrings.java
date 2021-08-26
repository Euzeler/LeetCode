public class CountingBinarySubstrings {
    public int countBinarySubstrings(String s){
        int ret = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int curr = s.charAt(i);
            boolean isChanged = false;
            //把第一个加进来
            int count = 1;
            for(int j = i + 1; j < s.length(); j++){
                if(count == 0){
                    break;
                }
                if(s.charAt(j) == curr && isChanged){
                    break;
                }
                else if(s.charAt(j) == curr && !isChanged){
                    count++;
                }
                else if(s.charAt(j) != curr){
                    if(!isChanged){
                        isChanged = true;
                    }
                    count--;
                }
            }
            if(count == 0){
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        CountingBinarySubstrings c = new CountingBinarySubstrings();
        String s = "1011001001";
        int ret = c.countBinarySubstrings(s);
        System.out.println(ret);
    }
}

//"000111000"
//"1011001001"
//这个就是时间不够了。说明算法是对的。86个测试用例通过了