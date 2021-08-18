public class CountingBits {
    public int[] countBits(int n){
        int[] ret = new int[n + 1];
        for(int i = 0; i <= n; i++){
            int count = 0;
            int I = i;
            while(I > 0){
                if(I % 2 == 1){
                    count++;
                }
                I /= 2;
            }
            ret[i] = count;
        }
        return ret;
    }

    public static void main(String[] args){
        CountingBits c = new CountingBits();
        int n = 5;
        int[] ret = c.countBits(n);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
