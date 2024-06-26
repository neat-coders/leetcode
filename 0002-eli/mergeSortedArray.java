class Solution {
    
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// I am starting from the end of nums1 and nums2 as current index pointer.
		int nums1Ptr = m - 1;
		int nums2Ptr = n - 1;
		int mergePtr = m + n - 1;

		// Compare elements from the end and put the larger one in the right place
		while (nums1Ptr >= 0 && nums2Ptr >= 0) {
			if (nums1[nums1Ptr] > nums2[nums2Ptr]) {
				nums1[mergePtr] = nums1[nums1Ptr];
				nums1Ptr--;
			} else {
				nums1[mergePtr] = nums2[nums2Ptr];
				nums2Ptr--;
			}
			mergePtr--;
		}

		// If there are still elements in nums2, add them
		while (nums2Ptr >= 0) {
			nums1[mergePtr] = nums2[nums2Ptr];
			nums2Ptr--;
			mergePtr--;
		}
	}
}