import collections


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def levelOrder( root):
        res = []
        q = collections.deque()
        q.append(root)
        while q:
            size = len(q)
            for i in range(size):
                node = q.popleft()
                if i == size - 1:  # Only append the last node at each level
                    res.append(node.val)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
        #     node = q.popleft()
        #     if node:
        #         res.append(node.val)
        #         q.append(node.right)
        return res


if __name__ == "__main__":
    # Creating a sample binary tree
    #       3
    #      / \
    #     9  20
    #       /  \
    #      15   7
    root = TreeNode(2)
    root.left = TreeNode(8)
    root.right = TreeNode(4)
    root.left.left = TreeNode(3)
    root.left.right = TreeNode(3)
    root.right.right = TreeNode(1)
    root.right.right.left  = TreeNode(6)

    # Call the function with the root node
    result = Solution.levelOrder(root)

    # Print the result
    print(result)
