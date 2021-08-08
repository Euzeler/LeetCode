public class Sqrt {
    public int mySqrt(int x){
        //用二分查找法
        if(x < 2){
            return x;
        }
        //因为下面涉及两个数相乘，所以要用long
        long left = 1;
        long right = x;
        while(left < right){
            //要注意每个数据的数据类型
            long mid = (left + right) / 2;
            if(mid * mid == x){
                return (int)mid;
            }
            if(mid * mid > x){
                right = mid;
            }
            if(mid * mid < x){
                left = mid + 1;
            }
        }
        return (int)(--left);
    }

    public static void main(String[] args){
        Sqrt sq = new Sqrt();
        int x = 2147395599;
        int res = sq.mySqrt(x);
        System.out.println(res);
    }
}
