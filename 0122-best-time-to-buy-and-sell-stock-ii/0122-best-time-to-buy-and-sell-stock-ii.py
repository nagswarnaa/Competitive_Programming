class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n=len(prices)
        stocks=deque()
        stocks.append(prices[0])
        profit=0
        for i in range(1,n):
            x= stocks.pop()
            if prices[i]<x:
                stocks.append(prices[i])
            else:
                profit+=(prices[i]-x)
                stocks.append(prices[i])
        return profit

