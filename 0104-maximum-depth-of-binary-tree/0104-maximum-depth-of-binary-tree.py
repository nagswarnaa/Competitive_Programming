# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findDepth(self,node1):
        if not node1:
            return 0
        return 1+max(self.findDepth(node1.left),self.findDepth(node1.right))

    def maxDepth(self, root: Optional[TreeNode]) -> int:
        return self.findDepth(root)