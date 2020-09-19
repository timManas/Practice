from TreeNodeObject import TreeNode

class Solution(object):
    def sumRootToLeaf(self, node):
        total = 0

        # Step1 - Fill Array with Binary Numbers
        numArr = []
        self.traverseTree(node, numArr, "")

        # Step2 - Calculate the Integer version
        self.fetchIntegerArr(numArr)

        # Step3 - Calculate Sum
        for num in numArr:
            total += num

        return total

    def traverseTree(self, node, numArr, sb):

        # Step1 - Check if current Node is null
        if node == None:
            return

        # Step2 - Add current Node val to StringBuilder
        sb += str(node.val)
        print("CurrentNode: ", node.val, "      StringBuilder: " + sb )

        # Step3 - Traverse Left and Right child Node
        self.traverseTree(node.left, numArr, sb)
        self.traverseTree(node.right,numArr, sb)

        # Step4 - Check if Node is leaf
        if node.left == None and node.right == None:
            numArr.append(sb)

        # Step5 - Remove the last element
        # Why ? Because we are done with this node and need to move to the next one
        sb = sb[:-1]



    def fetchIntegerArr(self, numArr):
        for i in range(numArr.__len__()):
            intNum = int(numArr[i], 2)
            numArr[i] = intNum




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
    print("Total: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Slightly tricky but not soo much
- Uses DFS pre order traversal

Solution
1. Create a StringBuilder to keep track of each element traversed
2. Check Left Subtree 
3. Check Right Subtree
4. Check if Leaf
    > Add string to numArr if true
5. Remove last element once both left and right have been traversed


'''