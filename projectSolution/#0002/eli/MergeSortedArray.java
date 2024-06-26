public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

      merge(nums1, m, nums2, n);
    }

    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexOne = m - 1;
        int indexTwo = n - 1;
//        int mergedIndex = m + n + 1;
        int mergedIndex = m + n - 1;
//        int index = mergedIndex;
//        while (indexOne >= 0 && indexTwo >= 0) {
//            if (nums1[indexOne] > nums2[indexTwo]) {}
//        }
//

        while (indexOne >= 0 && indexTwo >= 0) {
            if (nums1[indexOne] > nums2[indexTwo]) {
                nums1[mergedIndex--] = nums1[indexOne--];
            } else {
                nums1[mergedIndex--] = nums2[indexTwo--];
            }
        }

        while (indexTwo >= 0) {
//            nums1[mergedIndex-1] = nums2[indexTwo-1];
            nums1[mergedIndex--] = nums2[indexTwo--];
        }
        for (int num : nums1) {
            System.out.print(num + " ,");
        }
    }
}
