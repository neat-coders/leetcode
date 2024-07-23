/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let sellPrice=prices[0];
    let maxProfit=0;
    for(i=1;i<prices.length;i++){
            

        if(sellPrice < prices[i]){
            maxProfit  = maxProfit + (prices[i] - sellPrice);
        }
           sellPrice=prices[i];
    }
    return maxProfit;
};