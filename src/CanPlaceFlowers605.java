public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        //还可以种几朵花，
        if(n == 0) return true;
        if(flowerbed.length == 1) {
            if(n == 1 && flowerbed[0] == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else if(flowerbed.length == 2){
            if((flowerbed[0] == 0 && flowerbed[1] == 0) && n == 1){
                return true;
            }
            else return false;
        }
        else if(flowerbed.length >= 3){
            int count = 0;
            if(flowerbed[0] == 0 && flowerbed[1] == 0){
                count++;
                flowerbed[0] = 1;
            }
            if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
                count++;
                flowerbed[flowerbed.length - 1] = 1;
            }
            for(int i = 1; i < flowerbed.length - 2; i++){
                if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0){
                    count++;
                    flowerbed[i] = 1;
                }
            }
            if(n <= count){
                return true;
            }
            else return false;
        }
        return false;
    }

    public static void main(String[] args){
        CanPlaceFlowers605 can = new CanPlaceFlowers605();
        int[] flowerbed = {1,0,1,0,1,0,1};
        int n = 1;
        boolean ret = can.canPlaceFlowers(flowerbed, n);
        System.out.println(ret);
    }
}
