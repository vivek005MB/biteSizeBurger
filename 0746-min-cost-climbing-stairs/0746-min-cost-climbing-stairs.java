class Solution {
    int[] price;
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        // return bottomUp(cost);
        price = cost;
        int n = cost.length;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return topdown(n);
    }
    public int topdown(int n)
    {
        if(n == 0 || n ==1)
        {
            return 0;
        }
        else if(n == 2)
        {
            return Math.min(price[0], price[1]);
        }
        if(dp[n] != -1)
        {
            return dp[n];
        }
        dp[n] = Math.min(topdown(n-2)+price[n-2], topdown(n-1)+price[n-1]);
        return dp[n];
        
    }
    public int bottomUp(int[] cost)
    {
        // T.C : O(N)
        // S.C : O(N)
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.min(cost[1],cost[0]);

        for(int i = 3; i<=n; i++)
        {
            dp[i] = Math.min(dp[i-2] + cost[i-2] , dp[i-1]+ cost[i-1]);
        }
        return dp[n];
    }
}