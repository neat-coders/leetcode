/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {

    // set initial vars
    let fullBottles = numBottles;
    let emptyBottles = 0;
    let drank = 0;

    while(fullBottles > 0) {
        // drink all full bottles
        drank = drank + fullBottles;
        emptyBottles = emptyBottles + fullBottles;
        fullBottles = 0;

        remainder = emptyBottles % numExchange;

        if (remainder == 0) {
            // exchanging
            fullBottles = emptyBottles / numExchange;
            // set empyy bottles  
            emptyBottles = 0;      
        }
        else {
             // exchanging
            fullBottles = (emptyBottles - remainder) / numExchange;
            // set empyy bottles  
            emptyBottles = remainder;
        }
    }
    return drank;
};