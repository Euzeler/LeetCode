public class ClimbingStairs {
    public int climbStairs(int n){
        //爬楼梯问题的本质是斐波那契数列问题
        int[] dp = new int[n + 1];
        if(n == 1){
            return 1;
        }
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < n + 1; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args){
        ClimbingStairs cli = new ClimbingStairs();
        int a = 4;
        int res = cli.climbStairs(a);
        System.out.println(res);
    }
}
