class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n=len(heights)
        left=[0]*n
        right=[0]*n
        stk=[]
        #left bounds
        for x in range(n):
            if stk==[]:
                stk.append(x)
                left[x]=x
            else:
                if heights[x]<=heights[stk[-1]]:
                    while stk!=[] and heights[x]<=heights[stk[-1]]:
                        stk.pop()
                if stk==[]:
                    left[x]=0
                else:
                    left[x]=stk[-1]+1 
                stk.append(x)
        stk=[]        
        # right bounds
        for x in range(n-1,-1,-1):
            if stk==[]:
                stk.append(x)
                right[x]=n-1
            else:
                if heights[x]<=heights[stk[-1]]:
                    while stk!=[] and heights[x]<=heights[stk[-1]]:
                        stk.pop()
                if stk==[]:
                    right[x]=n-1
                else:
                    right[x]=stk[-1]-1 
                stk.append(x) 
        max_area=0
        for i in range(n):
            max_area=max(max_area,((right[i]-left[i]+1)*heights[i]))
        return max_area
                    
        
        