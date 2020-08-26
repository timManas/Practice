from TreeNodeObject import TreeNode
from collections import deque

class Solution(object):
    def mergeTrees(self, treeNode1, treeNode2):

        # Step1 - Check if node1 and node exits. Return nothing if true
        if treeNode1 == None and treeNode2 == None:
            return None

        # Step2 - Return the non-null node
        if treeNode1 == None:
            return treeNode2

        if treeNode2 == None:
            return treeNode1

        # Step3 - Combine both Array and add their respective values
        # Note: We traverse using preOrder traversal
        treeNode1.val += treeNode2.val
        treeNode1.left = self.mergeTrees(treeNode1.left, treeNode2.left)
        treeNode1.right = self.mergeTrees(treeNode1.right, treeNode2.right)


        return treeNode1



def main():
    # Ex1
    t11 = TreeNode(1)
    t12 = TreeNode(3)
    t13 = TreeNode(2)
    t14 = TreeNode(5)

    t11.left = t12
    t11.right = t13
    t12.left = t14

    t21 = TreeNode(2)
    t22 = TreeNode(1)
    t23 = TreeNode(3)
    t24 = TreeNode(4)
    t25 = TreeNode(7)

    t21.left = t22
    t21.right = t23
    t22.right = t24
    t23.right = t25

    # # Ex2
    # t11 = TreeNode()
    # t21 = TreeNode()

    # # Ex3
    # t11 = TreeNode(1)
    # t12 = TreeNode(2)
    # t13 = TreeNode(3)
    #
    # t11.left = t12
    # t12.left = t13
    #
    # t21 = TreeNode(1)
    # t22 = TreeNode(2)
    # t23 = TreeNode(3)
    #
    # t21.right = t22
    # t22.right = t23

    # Ex1
    # t11 = TreeNode(3)
    # t12 = TreeNode(4)
    # t13 = TreeNode(5)
    # t14 = TreeNode(1)
    # t15 = TreeNode(2)
    # t16 = TreeNode(0)
    #
    # t11.left = t12
    # t11.right = t13
    # t12.left = t14
    # t12.right = t15
    # t14.left = t16
    #
    # t21 = TreeNode(4)
    # t22 = TreeNode(1)
    # t23 = TreeNode(2)
    #
    # t21.left = t22
    # t21.right = t23


    solution = Solution()
    output = solution.mergeTrees(t11, t21)
    print("MergedTrees: ", output.val)


if __name__ == '__main__':
    main()

'''
Notes
- This is not fucking easy
- Solution is super elegenat though
- User recursion to solve


Solution 
1. Traverse using PreOrder Traversal
2. Fetch a non null node
3. Add their respective values
4. Do the same for their child Nodes

'''