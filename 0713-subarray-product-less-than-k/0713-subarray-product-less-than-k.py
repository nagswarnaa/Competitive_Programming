class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        n=len(nums)
        count=0
        l,r=0,0
        p=1
        while r<n:
            p*=nums[r]
            if p<k:
                count+=(r-l+1)
            else:
                while l<r and p>=k:
                    p/=nums[l]
                    l+=1
                if p<k:
                    count+=(r-l+1)
            r+=1
        return count


        