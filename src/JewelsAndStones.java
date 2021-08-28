public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones){
        int ret = 0;
        for(int i = 0; i < jewels.length(); i++){
            for(int j = 0; j < stones.length(); j++){
                if(stones.charAt(j) == jewels.charAt(i)){
                    ret++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbbb";
        JewelsAndStones je = new JewelsAndStones();
        int ret = je.numJewelsInStones(jewels, stones);
        System.out.println(ret);
    }
}
