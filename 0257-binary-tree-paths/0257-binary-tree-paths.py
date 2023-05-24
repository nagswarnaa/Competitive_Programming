# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        result=[]
        def allPaths(root,pth):
            if root is None:
                return 
            pth+=str(root.val)
            if root.left is None and root.right is None:
                result.append(pth)
            else:
                pth+='->'
                allPaths(root.left,pth)
                allPaths(root.right,pth)
        allPaths(root,'')
        return result
