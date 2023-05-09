class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        for i in nums:
            n=abs(i)
            if nums[n]<0:
                return n
            nums[n]=-nums[n]
        return nums.length