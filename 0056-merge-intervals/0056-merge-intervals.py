class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        list.sort(intervals)
        res=[intervals[0]]
        for x in range(1,len(intervals)):
            temp=res[-1]
            if temp[1]>=intervals[x][0]:
                max_end=max(temp[1],intervals[x][1])
                res.pop()
                res.append([temp[0],max_end])
            else:
                res.append(intervals[x])
        return res
        