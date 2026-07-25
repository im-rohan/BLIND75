class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy, maxProfit = prices[0], 0

        for price in prices:
            if buy > price:
                buy = price
            else:
                maxProfit = max(maxProfit, price - buy)
        
        return maxProfit