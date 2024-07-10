class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int sumOfTotalBottlesYouCanDrink=numBottles;

      while(numBottles>=numExchange) {
           int quotient=numBottles/numExchange;
           int rem=numBottles % numExchange;
           sumOfTotalBottlesYouCanDrink+=quotient;
           numBottles=quotient+rem;
      }

      return sumOfTotalBottlesYouCanDrink;
    }
}