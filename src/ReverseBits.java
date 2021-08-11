public class ReverseBits {
    public int reverseBits(int n){
        //考察左移和右移
        int ret = 0;
        for(int i = 0; i <= 31; i++){
            ret = ret << 1;
            ret = ret | (n & 1);
            n = n >> 1;
        }
        return ret;
    }

    public static void main(String[] args){
        ReverseBits reverseBits = new ReverseBits();
        int n = 0b11111111111111111111111111111101;
        int ret = reverseBits.reverseBits(n);
        System.out.println("函数的输出结果：" + ret);
    }
}
