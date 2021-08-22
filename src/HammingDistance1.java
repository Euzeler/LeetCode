public class HammingDistance1 {
    public int hammingDistance(int x, int y){
        String sx = toBinary(x);
        String sy = toBinary(y);
        int minLen = Math.min(sx.length(), sy.length());
        int maxLen = Math.max(sx.length(), sy.length());
        int count = 0;
        for(int i = 0; i < minLen; i++){
            if(sx.charAt(i) != sy.charAt(i)){
                count++;
            }
        }
        if(sx.length() < sy.length()){
            for(int i = minLen; i < maxLen; i++){
                if(sy.charAt(i) != '0'){
                    count++;
                }
            }
        }
        else if(sx.length() > sy.length()){
            for(int i = minLen; i < maxLen; i++){
                if(sx.charAt(i) != '0'){
                    count++;
                }
            }
        }
        return count;
    }

    public String toBinary(int x){
        StringBuilder ret = new StringBuilder();
        while(x > 0){
            ret.insert(0, x % 2);
            x /= 2;
        }
        String ret1 = ret.reverse().toString();
        return ret1;
    }

    public static void main(String[] args){
        HammingDistance1 h = new HammingDistance1();
        int x = 1, y = 4;
        int ret = h.hammingDistance(x, y);
        System.out.println(ret);
    }
}
