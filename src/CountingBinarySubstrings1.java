public class CountingBinarySubstrings1 {
    public int countBinarySubstrings(String s) {
        //需要看discuss，先做一个tmp数组，记录连续的0，1的数量
        int[] tmp = new int[s.length()];
        tmp[0] = 1;
        int t = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i - 1) != s.charAt(i)){
                tmp[++t] = 1;
            }
            else {
                tmp[t]++;
            }
        }

//        for(int i = 0; i < s.length(); i++){
//            System.out.println(tmp[i]);
//        }
        //再利用discuss里面总结的，写代码要一步一步检查，输出检查
        int ret = 0;
        for(int i = 0; i < tmp.length - 1; i++){
            ret += Math.min(tmp[i], tmp[i + 1]);
        }
        return ret;
    }

    public static void main(String[] args){
        CountingBinarySubstrings1 c = new CountingBinarySubstrings1();
        String s = "1011001001";
        int ret = c.countBinarySubstrings(s);
        System.out.println(ret);
    }
}
