/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
 
var rotate = function(nums, k) {
    k = k % nums.length;
   for(i=0;i<k;i++)
   {
      lastElt=nums[nums.length - 1]
       nums.unshift(lastElt) ;
       nums.pop();
  
   }
  
};