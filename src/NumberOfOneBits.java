public class NumberOfOneBits {
    public int hammingWeight(int n){
        int ret = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) != 0){
                ret++;
            }
            n = n >> 1;
        }
        return ret;
    }

    public static void main(String[] args){

    }
}
