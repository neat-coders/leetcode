def bestTimeToSellStock(prices):
    total_profit = 0
    
    for i in range(1, len(prices)):
        if prices[i] > prices[i - 1]:
            total_profit += prices[i] - prices[i - 1]
    
    return total_profit


prices = [1,2,2,4,6]
print(bestTimeToSellStock(prices))  # Output: 7
