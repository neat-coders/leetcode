class Solution {
    public int removeElement(int[] nums, int val) {
         int count = 0;
        // int[] tempArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        return count;
    }

    }
