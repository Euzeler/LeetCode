public class CountPrimes1 {
    public int countPrimes(int n){
        //找质数，传统节目，第一次运行时间超了
        boolean[] isNotPrime = new boolean[n];
        if(n == 0 || n == 1){
            return 0;
        }
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        //用根号这个条件是更好的，速度快了一倍左右，因为这可以大幅度减少循环的次数
        for(int i = 2; i < Math.sqrt(n); i++){
            if(isNotPrime[i] == false){
                for(int j = i; i * j < n; j++){
                    isNotPrime[i * j] = true;
                }
            }
            else{

            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(isNotPrime[i] == false){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        CountPrimes1 countPrimes = new CountPrimes1();
        int n = 10;
        int ret = countPrimes.countPrimes(n);
        System.out.println(ret);
    }
}
