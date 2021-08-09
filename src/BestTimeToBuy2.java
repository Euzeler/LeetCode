public class BestTimeToBuy2 {
    public int maxProfit(int[] prices){
        //买在卖之前，可以多次买卖
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i + 1] - prices[i] > 0){
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        BestTimeToBuy2 bestTimeToBuy = new BestTimeToBuy2();
        int res = bestTimeToBuy.maxProfit(arr);
        System.out.println(res);
    }
}
