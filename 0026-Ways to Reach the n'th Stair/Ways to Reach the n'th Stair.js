/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
     
  
    if (n == 0)
        return 1;
    else if (n < 0)
        return 0;

    else
        return climbStairs(n - 1) + climbStairs(n - 2);
                          

};