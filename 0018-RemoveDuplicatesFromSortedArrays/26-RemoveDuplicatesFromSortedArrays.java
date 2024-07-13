class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0  , j = 1 ;
        for(int k = 0 ; k < nums.length -1 ; k++ ){
            if(nums[i] == nums[j]){
                j++;
            }
            else if(nums[i] != nums[j]){
                nums[++i] = nums[j++];
            }
        }
        return i+1 ;

    }
}