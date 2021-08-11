public class CountPrimes {
    public int countPrimes(int n){
        //找质数，传统节目，第一次运行时间超了
        if(n == 0 || n == 1) return 0;
        int res = 0;
        for(int i = 2; i < n; i++){
            int tmp = i;
            res++;
            for(int j = 2; j <= Math.sqrt(tmp); j++){
                if(tmp % j == 0) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        CountPrimes countPrimes = new CountPrimes();
        int n = 1500000;
        int ret = countPrimes.countPrimes(n);
        System.out.println(ret);
    }
}
