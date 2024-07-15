class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length; 

        int[] temp = new int[k];
        System.arraycopy(nums, length - k, temp, 0, k);
        System.arraycopy(nums, 0, nums, k, length - k);
        System.arraycopy(temp, 0, nums, 0, k);
    }
}
