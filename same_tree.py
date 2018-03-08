#Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if(p != q):
            if(p and q):
                if(p.val == q.val):
                    return (self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right))
                else:
                    return False
            else:
                return False
        else:
            return True

if __name__ == '__main__':
    s = Solution()
    n = TreeNode(5)
    m = TreeNode(5)
    n.left = TreeNode(4)
    m.right = TreeNode(5)
    print(s.isSameTree(n, m))
                
        