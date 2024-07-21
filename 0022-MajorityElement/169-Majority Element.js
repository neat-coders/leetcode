/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    const hash = new Map(); 
    const max= Math.ceil(nums.length / 2);
    for (i=0;i<nums.length;i++) {   
      if(hash.has(nums[i])){       
          hash.set(nums[i],hash.get(nums[i]) + 1);    
      }   
      else{
          hash.set(nums[i],1)
      }
       if(hash.get(nums[i]) +1 > max){
         
           return nums[i];
  
       }
    }
   
   
  };