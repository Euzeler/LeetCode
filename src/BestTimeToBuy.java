public class BestTimeToBuy {
    public int maxProfit(int[] prices){
//        int max = 0;
//        for(int i = 0; i < prices.length; i++){
//            for(int j = i; j < prices.length; j++){
//                if(prices[j] - prices[i] > max){
//                    max = prices[j] - prices[i];
//                }
//            }
//        }
//        return max;
        //上面这个方法太慢，最笨的方法了
        //下面这个快，因为只循环了一遍
        int max = 0;
        int profile = 0;
        for(int i = 0; i < prices.length - 1; i++){
            profile += prices[i + 1] - prices[i];
            if(max < profile){
                max = profile;
            }
            if(profile < 0){
                profile = 0;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        BestTimeToBuy bestTimeToBuy = new BestTimeToBuy();
        int res = bestTimeToBuy.maxProfit(arr);
        System.out.println(res);
    }
}
