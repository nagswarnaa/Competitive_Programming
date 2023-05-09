class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        i=0
        while i <n:
            idx=nums[i]
            if 0<=idx<n and nums[i]!=nums[idx]:
                nums[idx],nums[i]=nums[i],nums[idx]
            else:
                i+=1
        for i in range(n):
            if i!=nums[i]:
                return i
        return n;                    