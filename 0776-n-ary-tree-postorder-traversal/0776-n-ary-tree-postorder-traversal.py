"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
        
    def postorder(self, root: 'Node') -> List[int]:
        post=[]
        def order(root):
            if not root:
               return 
            for i in root.children:
                order(i)
            post.append(root.val)
        order(root)
        return post
        