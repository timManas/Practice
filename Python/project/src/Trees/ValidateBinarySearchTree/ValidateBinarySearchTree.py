from TreeNodeObject import TreeNode

class Solution(object):
    def isValidBST(self, node):
        nodeList = []
        return self.traverseTree(node, nodeList)

    # Check Left -> Middle > Right
    def traverseTree(self, node, nodeList):

        # Step1 - Check if node is null
        if node == None:
            return True

        # Step2 - Traverse Left Subtree
        left = self.traverseTree(node.left, nodeList)

        # Step3 - Check if Current Node is GREATER than the last node in the list
        print("CurrentNode: ", node.val)
        if nodeList.__len__() > 0 and nodeList[nodeList.__len__() - 1] >= node.val:
                return False
        nodeList.append(node.val)

        # Step4 - Traverse Right SubTree
        right = self.traverseTree(node.right, nodeList)

        # Step5 - Return results of both left and Right
        # We use "AND" because we need both left to be smaller and right to be larger
        # We return false otherwise
        return (left and right)


def main():
    # t1 = TreeNode(5)
    # t2 = TreeNode(1)
    # t3 = TreeNode(4)
    # t4 = TreeNode(3)
    # t5 = TreeNode(6)
    # t1.left = t2
    # t1.right = t3
    # t3.left = t4
    # t3.right = t5

    # t11 = TreeNode(2)
    # t22 = TreeNode(1)
    # t33 = TreeNode(3)
    # t11.left = t22
    # t11.right = t33

    t1 = TreeNode(10)
    t2 = TreeNode(5)
    t3 = TreeNode(15)
    t4 = TreeNode(6)
    t5 = TreeNode(20)

    t1.left = t2
    t1.right = t3
    t3.left = t4
    t3.right = t5

    solution = Solution()
    output = solution.isValidBST(t1)
    print("Is Valid BST: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Not that difficult but involves some thinking
- Basically  the trick is, all the nodes on the left subtree have to be smaller the current Node
    > While all the nodes on the Right subtree have to the bigger than the current Node
- In order to solve this, we need to use InOrder Traversal

Solution
0. Create a list to store all node values
1. Traverse Tree  in the following order:
    - Left
    - Middle
    - Right
2. In the Middle, we check if the current Node is GREATER than the last Node 
3. Return the result of the left and right child



'''