class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) {
            return 0;
        }
        
        int uniqueCount = 1; 
        int currentUnique = nums[0]; 
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentUnique) {
                currentUnique = nums[i];
                nums[uniqueCount] = currentUnique;
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
}
