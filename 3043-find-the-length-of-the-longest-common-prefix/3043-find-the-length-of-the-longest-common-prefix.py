class Trie():
    def __init__(self):
        self.children={}
        self.isEndOfWord=False
        
    def insert(self,word,root):
        temp=root
        for x in word:
            if x not in temp.children:
                temp.children[x]=Trie()
            temp=temp.children[x]
        temp.isEndOfWord= True
        
    def search(self,word,root):
        n=0
        temp=root
        for x in word:
            if x in temp.children:
                n+=1
                temp=temp.children[x]
            else:
                break
        return n
            
class Solution:
    def __init__(self):
        self.root=Trie()
    def longestCommonPrefix(self, arr1: List[int], arr2: List[int]) -> int:
        list1=[str(x) for x in arr1]
        list2=[str(x) for x in arr2]
        largest=[]
        smallest=[]
        n=len(list1)
        m=len(list2)
        
        if n>m:
            largest=list1
            smallest=list2
        else:
            largest=list2
            smallest=list1
        for x in largest:
            self.root.insert(x,self.root)
        maxPrefix=0
        for x in smallest:
            num=self.root.search(x,self.root)
            maxPrefix=max(maxPrefix,num)
        return maxPrefix
        