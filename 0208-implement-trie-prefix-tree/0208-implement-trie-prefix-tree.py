class Node:
    def __init__(self):
        self.children={}
        self.isWord=False
class Trie:
    def __init__(self):
        self.root= Node()

    def insert(self, word: str) -> None:
        temp=self.root
        for x in word:
            if x not in temp.children:
                temp.children[x]= Node()
            temp=temp.children[x]
        temp.isWord=True

    def search(self, word: str) -> bool:
        temp=self.root
        for x in word:
            if x not in temp.children:
                return False
            else:
                temp=temp.children[x]
        return temp.isWord

        

    def startsWith(self, prefix: str) -> bool:
        temp=self.root
        for x in prefix:
            if x not in temp.children:
                return False
            else:
                temp=temp.children[x]
        return True
        


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)