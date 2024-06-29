class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        #I will use Hashmap , Store every value ,
        # Then find max for the number , I will iterate through starting from 1 to the maximum
        # then if there is a missing number in hashmap I will return that number
        # else I will return max number plus 1 which is the will be the next postive number
        # one edge I have to make sure that the max number is postive number 
        mp={} 
        for index,val in enumerate(nums):
            mp[val]=index

        #Find max

        mx=max(nums)
        
        for val in range(1,mx):
            if val not in mp:
                return val
            
        return mx+1 if mx>=0 else 1