class Solution {
    public int majorityElement(int[] nums) {
          int majorityElement = 0, count = 0;
    
    for (int num : nums) {
        if (count == 0) {
            majorityElement = num;
            count++;
        } else if (num == majorityElement) {
            count++;
        } else {
            count--;
        }
    }
    
    return majorityElement;
    }
}
