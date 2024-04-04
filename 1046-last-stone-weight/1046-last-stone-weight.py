class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        min_heap=[]
        for x in stones:
            heapq.heappush(min_heap,-1*x)
        while len(min_heap)>1:
            x=-1*heapq.heappop(min_heap)
            y=-1*heapq.heappop(min_heap)
            if x!=y:
                heapq.heappush(min_heap,(-1*(x-y)))
            print(min_heap)
        return 0 if len(min_heap)==0 else -1*min_heap[0]

