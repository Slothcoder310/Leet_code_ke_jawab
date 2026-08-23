class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        
        i = 1

        if len(nums) == 1:
            return 0
        
        for i in range(len(nums) - 1):
            if nums[i-1] < nums[i] and nums[i+1] < nums[i]:
                return i
        

        if nums[0] > nums[1]:
            return 0

        
        return len(nums) - 1