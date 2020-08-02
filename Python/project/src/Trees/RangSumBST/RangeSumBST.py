
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution(object):
    def rangeSumBST(self, root, L, R):

        # Step1 - Create Set
        numInRange = set()     # Create Set

        # Step2 - Traverse Tree
        traverseTree(root, L, R, numInRange)
        print("NumInRange: ", numInRange)

        # Step3 - Get the Sum of all the numbers in Range
        output = getSumNumInRange(numInRange)

        return output


def traverseTree(node, L, R, numInRange):

    # Step1 - Check if current Node is zero
    if node == None:
        return 0

    # Step2 - Check if current node is within range
    if L <= node.val and R >= node.val:
        numInRange.add(node.val)

    # Step3 - Check both left end Right Node
    traverseTree(node.left, L, R, numInRange)
    traverseTree(node.right, L, R, numInRange)



def getSumNumInRange(numInRange):
    sum = 0
    for num in numInRange:
        sum += num
    return sum



def main():

    node1 = TreeNode(10)
    node2 = TreeNode(5)
    node3 = TreeNode(15)
    node4 = TreeNode(3)
    node5 = TreeNode(7)
    node6 = TreeNode(13)
    node7 = TreeNode(18)
    node8 = TreeNode(1)
    node9 = TreeNode(6)

    node1.left = node2
    node1.right = node3

    node2.left = node4
    node2.right = node5

    node3.left = node6
    node3.right = node7

    node4.left = node8

    node5.left = node9

    L = 6
    R = 10
    solution = Solution()
    output = solution.rangeSumBST(node1, L, R)
    print("Range Sum of BST: " + str(output))




if __name__ == '__main__':
    main()

'''
Notes
- Question is Medium Tricky

Solution
1. Traverse tree
2. Check if  L < currentNode.val && R > currentNode.val
    > If true, add to set
3. Continue traversing using PreOrder Traversal
4. Traverse until we reach the end

'''