public class HammingDistance {
    public int hammingDistance(int x, int y) {
//        int[] binaryX = new int[32];
//        int[] binaryY = new int[32];
//        int i = 0;
//        int j = 0;
//        int result = 0;
//        while(x > 0){
//            binaryX[i] = x % 2;
//            x /= 2;
//            i++;
//        }
//        while(y > 0){
//            binaryY[j] = y % 2;
//            y /= 2;
//            j++;
//        }
//        for(int k = 0; k < 32; k++){
//            if(binaryY[k] != binaryX[k]){
//                result++;
//            }
//        }
//        return result;
        int result = 0;
        if (x == y){
            return result;
        }
        while(x != 0 || y != 0){
            if(x % 2 != y % 2){
                result++;
            }
            x /= 2;
            y /= 2;
        }
        return result;
    }

    public static void main(String[] args){
        HammingDistance ham = new HammingDistance();
        System.out.println(ham.hammingDistance(7, 5));
    }
}
