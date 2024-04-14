class Solution:
    def scoreOfString(self, s: str) -> int:
        score=0
        for x in range(0,len(s)-1):
            score+=abs(ord(s[x])-ord(s[x+1]))
        return score

        