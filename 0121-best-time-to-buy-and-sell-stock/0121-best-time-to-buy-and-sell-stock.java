class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int curr: prices)
        {
            if(curr >= min)
            {
                profit = Math.max(profit, curr - min);
            }
            else{
                min = curr;
            }
            
        }
        return profit;
        
    }
}