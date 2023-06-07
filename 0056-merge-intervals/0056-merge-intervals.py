class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        result=[]
        result.append(intervals[0])
        for i in range(1,len(intervals)):
            x=result[-1][1]
            y=intervals[i][0]
            if x>=y:
                temp=result.pop()
                result.append([temp[0],max(intervals[i][1],temp[1])])
            else:
                result.append(intervals[i])
        return result

