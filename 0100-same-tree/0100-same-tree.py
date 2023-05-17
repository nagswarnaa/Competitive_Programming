# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def checkNode(self,node1,node2):
        if not node1 and not node2:
            return True
        if not node1 or not node2:
            return False
        return node1.val==node2.val and self.checkNode(node1.left,node2.left) and self.checkNode(node1.right,node2.right)

    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        return self.checkNode(p,q)


