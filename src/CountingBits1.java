public class CountingBits1 {
    public int[] countBits(int n){
        //优化，
        //This uses the hint from the description about using ranges. Basically, the numbers in one range are equal to 1 plus all of the numbers in the ranges before it.
        // If you write out the binary numbers, you can see that numbers 8-15 have the same pattern as 0-7 but with a 1 at the front.
        //
        //My logic was to copy the previous values (starting at 0) until a power of 2 was hit (new range), at which point we just reset the t pointer back to 0 to begin the new range.
        //每个range里面的值等于0-range之前的值。
        int[] ret = new int[n + 1];
        ret[0] = 0;
        int pow = 1;
        for(int i = 1, t = 0; i <= n; i++, t++){
            if(i == pow){
                pow *= 2;
                t = 0;
            }
            ret[i] = ret[t] + 1;
        }
        return ret;
    }

    public static void main(String[] args){
        CountingBits1 c = new CountingBits1();
        int n = 5;
        int[] ret = c.countBits(n);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
