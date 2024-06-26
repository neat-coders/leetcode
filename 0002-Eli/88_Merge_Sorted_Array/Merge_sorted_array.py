
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        """
        Add all the nums2 element to the end of nums1
        Then sort nums1
        """
        index=len(nums1)-1
        n=n-1
        while n>=0:
            nums1[index]=nums2[n]
            n-=1
            index-=1
        nums1.sort()