class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int finalProfit = 0;

        while (sell < prices.length)
        {
            if (prices[buy] < prices[sell])
            {
                int profit = prices[sell] - prices[buy];
                finalProfit = Math.max(profit, finalProfit);
            }
            else
            buy = sell;

            sell ++;
        }

        return finalProfit;

    }
}
