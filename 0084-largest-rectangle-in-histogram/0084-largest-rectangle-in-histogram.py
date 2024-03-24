class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n=len(heights)
        left=[0]*n
        right=[n-1]*n
        stk=[]
        #left bounds
        for x in range(n):
            while stk and heights[x]<=heights[stk[-1]]:
                stk.pop()
            left[x] = stk[-1]+1 if stk else 0
            stk.append(x)
        stk=[]        
        # right bounds
        for x in range(n-1,-1,-1):
            while stk!=[] and heights[x]<=heights[stk[-1]]:
                stk.pop()
            right[x] = stk[-1]-1 if stk else n-1
            stk.append(x) 
        max_area=0
        for i in range(n):
            max_area=max(max_area,((right[i]-left[i]+1)*heights[i]))
        return max_area
                    
        
        