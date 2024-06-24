class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        """
        I will use two pointer , 
        The first pointer increase 
        the second pointer increase when the value of the first 
        pointer is non zero 
 
        """
        l=0
        for r in range(len(nums)):
            if nums[r]!=0:
                nums[l],nums[r]=nums[r],nums[l]
                l+=1

        

        