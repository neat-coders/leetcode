class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles, lastDrunk, remaining ;
        while(numBottles >= numExchange){
            lastDrunk = numBottles / numExchange;
            remaining = numBottles % numExchange;
            totalDrunk += lastDrunk;
            numBottles = remaining + lastDrunk;
        }
        return totalDrunk;
    }
}