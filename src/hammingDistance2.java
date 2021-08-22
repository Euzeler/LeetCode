//public class HammingDistance2 {
//    public int hammingDistance(int x, int y){
//        //用移位操作更快
//        int count = 0;
//        while(x > 0 || y > 0){
//            int X = x & 1;
//            int Y = y & 1;
//            if(X != Y){
//                count++;
//            }
//
//            x = x >> 1;
//            y = y >> 1;
//        }
//        return count;
//    }
//
//    public static void main(String[] args){
//        HammingDistance1 h = new HammingDistance1();
//        int x = 1, y = 4;
//        int ret = h.hammingDistance(x, y);
//        System.out.println(ret);
//    }
//}
