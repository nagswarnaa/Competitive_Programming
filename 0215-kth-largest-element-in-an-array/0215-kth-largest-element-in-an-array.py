class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        min_heap = []
        for x in nums:
            if len(min_heap) < k:
                heapq.heappush(min_heap, x)
            else:
                if x > min_heap[0]:
                    heapq.heappushpop(min_heap, x) 
        return min_heap[0]
