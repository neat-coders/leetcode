/**
 * @param {number[]} 
 * @return {number}
 */

var maxArea = function(height) {

    let left = 0;
    let right = height.length - 1;
    let maxArea = 0;

    let currentArea;

    while (left < right) {
        currentArea = Math.min(height[left],height[right]) * (right - left);
        
        if(currentArea > maxArea) {
            maxArea = currentArea
        }

        if(height[left] < height[right]) {
            left++;
        }
        else {
            right--;
        }
    }
    return maxArea;
};