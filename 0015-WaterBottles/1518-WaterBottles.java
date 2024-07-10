class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sumTotal = numBottles ;
        while(numBottles  >= numExchange){
            sumTotal += numBottles / numExchange ;
            int mod = numBottles % numExchange;
            numBottles = numBottles / numExchange + mod;

        }

        return sumTotal;

    }
}