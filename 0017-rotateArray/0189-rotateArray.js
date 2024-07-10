/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    let newArray = new Array(nums.length);

    // remove "full circles" from step number
    k = k % nums.length;

    // Copy the last k elements to the beginning of newArray
    for (let i = 0; i < k; i++) {
        newArray[i] = nums[nums.length - k + i];
    }

    // Copy the rest of the elements
    for (let i = k; i < nums.length; i++) {
        newArray[i] = nums[i - k];
    }

    for (let i = 0; i < nums.length; i++) {
        nums[i] = newArray[i];
    }
};