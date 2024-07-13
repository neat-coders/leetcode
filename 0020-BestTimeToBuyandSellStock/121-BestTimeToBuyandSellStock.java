class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], maxProfit= 0 ;
        for(int price : prices ){
            if(price < minPrice){
                minPrice = price ;
            }

            if(price - minPrice > maxProfit){
                maxProfit= price - minPrice;
            }
        }
        return maxProfit;

    }
}