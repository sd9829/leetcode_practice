# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def dfs(leftChild, rightChild):
            if not leftChild and not rightChild:
                return True
            if not leftChild or not rightChild:
                return False
            if leftChild.val != rightChild.val:
                return False
            
            return (dfs(leftChild.left, rightChild.right) and 
                    dfs(leftChild.right, rightChild.left))
            
        return dfs(root.left, root.right)
        
