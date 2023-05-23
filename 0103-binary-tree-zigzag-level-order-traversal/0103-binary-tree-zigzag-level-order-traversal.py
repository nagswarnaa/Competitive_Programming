# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result=[]
        def dfs(root,level):
            if not root:
                return 
            if level==len(result):
                result.append([])
            result[level].append(root.val)
            dfs(root.left,level+1)
            dfs(root.right,level+1)

        dfs(root,0)
        for i in range(len(result)):
            if i&1:
                result[i]=result[i][::-1]
        return result    

        