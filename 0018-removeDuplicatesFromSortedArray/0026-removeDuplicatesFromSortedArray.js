/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if (nums.length <= 1) {
        return nums.length;
    }
    let p0 = 1;
    for (let i = 1; i < nums.length; i++) {
        if (nums[i] !== nums[i - 1]) {
            nums[p0] = nums[i];
            p0++;
        }
    }
    return p0;
};