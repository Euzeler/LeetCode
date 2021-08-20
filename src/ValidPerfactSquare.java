public class ValidPerfactSquare {
    public boolean isPerfectSquare(int num) {
        //二分查找
        //这种题目老是用int的范围来搞你。
        if(num == 1) return true;
        long l = 1;
        long r = (long) Math.pow(2, 16);
        while(l <= r){
            long mid = (l + r) / 2;
            if(mid * mid == num){
                return true;
            }
            else if(mid * mid < num){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ValidPerfactSquare v = new ValidPerfactSquare();
        int num = 2147395600;
        boolean ret = v.isPerfectSquare(num);
        System.out.println(ret);
        System.out.println((int)Math.sqrt(num));

    }
}
