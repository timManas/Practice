from TreeNodeObject import TreeNode

class Solution(object):
    def sumRootToLeaf(self, node):
        total = 0

        # Step1 - Fill Array with Binary Numbers
        numArr = []
        self.traverseTree(node, numArr)

        # Step2 - Calculate the Integer version
        self.fetchIntegerArr(numArr)

        # Step3 - Calculate Sum
        for num in numArr:
            total += num

        return total

    def traverseTree(self, node, numArr):

        if node == None:
            return

        self.traverseTree(node.left, numArr)
        self.traverseTree(node.right,numArr)





    def fetchIntegerArr(self, numArr):
        pass


def main():

    t1 = TreeNode(1)
    t2 = TreeNode(0)
    t3 = TreeNode(1)
    t4 = TreeNode(0)
    t5 = TreeNode(1)
    t6 = TreeNode(0)
    t7 = TreeNode(1)

    t1.left = t2
    t1.right = t3

    t2.left = t4
    t2.right = t5

    t3.left = t6
    t3.right = t7

    solution = Solution()
    output = solution.sumRootToLeaf(t1)
    print("Total: ", output.val)


if __name__ == '__main__':
    main()