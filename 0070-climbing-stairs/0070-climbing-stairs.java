class Solution {
    int[] dp;
    
    public int climbStairs(int n) {
        return bottomup(n);
       
        
        // dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // return topdown(n);
        

        
    }
    public int bottomup(int n)
    {
        // bottom up approach : TC : O(N)  SC : O(1) 
        if(n <=2)return n;
        int prev2 = 1;
        int prev1 = 2;
        int curr = 0;
        for(int i = 3; i<=n;i++)
        {
            curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;
            
        }
        return curr;
    }
    public int topdown(int n)
    {
        //T.C : O(N) 
        //S.C : O(N)
        
        if(n <= 2)return n;
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = topdown(n-2) + topdown(n-1);
        dp[n] = ans;
        return ans;
        
    }
}