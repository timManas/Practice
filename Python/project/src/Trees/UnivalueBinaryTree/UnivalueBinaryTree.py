from TreeNodeObject import TreeNode

class Solution(object):
    def isUnivalTree(self, node):
        return self.traverseTree(node, node.val)

    def traverseTree(self, node, val):

        # Step1 - Check if Node is null. Return true anyway
        if node == None:
            return True

        # Step2 - Check if current node val is same as original Val at Root
        if node.val != val:
            return False

        print ("CurrentNode Val: ", node.val)

        # Step3 - Traverse Left and Right childNodes
        isLeftUniValTree = self.traverseTree(node.left, val)
        isRightUniValTree = self.traverseTree(node.right, val)

        # Step4 - Return True if Both left and right are the same, False otherwise
        return isLeftUniValTree and isRightUniValTree



def main():
    t1 = TreeNode(1)
    t2 = TreeNode(1)
    t3 = TreeNode(1)
    t4 = TreeNode(1)
    t5 = TreeNode(1)
    t6 = TreeNode(1)

    t1.left = t2
    t1.right = t3

    t2.left = t4
    t2.right = t5

    t3.right = t6

    solution = Solution()
    output = solution.isUnivalTree(t1)
    print("Is Univalued Tree: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Super Easy
- Nothing complicated about htis 

Solution 
1. Use DFS PreOrder + PostOrder Traversal
1. Check if Node is null
2. Check if current Node val is the same as the Root Node
3. Traverse Left & Right Subtree
4. Return true if both left and right subtree have same value, false otherwise


'''