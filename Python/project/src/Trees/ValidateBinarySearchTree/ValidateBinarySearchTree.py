from TreeNodeObject import TreeNode

class Solution(object):
    def isValidBST(self, node):
        return self.traverseTree(node)

    def traverseTree(self, node):

        if node == None:
            return True

        print("CurrentNode: ", node.val)
        self.traverseTree(node.left)
        self.traverseTree(node.right)

        if node.left != None and node.left.val >= node.val:
            return False
        if node.right != None and node.right.val <= node.val:
            return False

        return True


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
    