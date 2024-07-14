/**
 * @param {number[]} nums
 * @return {number[][]}
 */

 function recurse(nums, start, path, subsets) {
    subsets.push([...path]);
    for(let i = start ; i < nums.length ; i++) {
        path.push(nums[i]);
        recurse(nums, i+1, path, subsets);
        path.pop();
    }
 }

var subsets = function(nums) {
    let subsets = [];
    recurse(nums, 0, [], subsets);
    return subsets;
};