class Solution:
    def maxPalindromesAfterOperations(self, words: List[str]) -> int:
        words=sorted(words,key=len)
        count={}
        for x in words:
            for y in x:
                count[y]=count.get(y,0)+1
        pairs=0
        for x in count.values():
            pairs+=(x//2)
        pal=0    
        for x in words:
            n=len(x)
            if n==1:
                pal+=1
            else:
                q=n//2
                if pairs>=q:
                   pal+=1
                   pairs-=q
        return pal 
                
            


         
        