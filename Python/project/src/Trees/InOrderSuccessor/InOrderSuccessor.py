from TreeNodeObject import TreeNode

class Solution(object):
    def inorderSuccessor(self, node, target):

        # Step1 - Create Dictionary to store nodes and list to store val indexes
        nodeList = []
        nodeDic = {}

        # Step2 - Traverse Tree
        self.traverseTree(node, target, nodeDic, nodeList)
        print("Dictionary: ", nodeDic)

        # Step3 - Check if target is in dictionary
        if (target.val not in nodeDic):
            return None

        # Step4 - Find the idnex
        index = nodeList.index(target.val)

        if index == nodeList.__len__() - 1:
            return None

        # Step5 - Return the node
        return nodeDic[nodeList[index + 1]]


    def traverseTree(self, node, target, dic, nodeList):
        if node == None:
            return

        self.traverseTree(node.left, target, dic, nodeList)
        print("Current: ", node.val)
        dic[node.val] = node
        nodeList.append(node.val)
        self.traverseTree(node.right, target, dic, nodeList)


def main():
    t11 = TreeNode(2)
    t12 = TreeNode(1)
    t13 = TreeNode(3)

    t11.left = t12
    t11.right = t13
    p = t12

    solution = Solution()
    output = solution.inorderSuccessor(t11, p)
    print("In Order Successor: ", output.val)

if __name__ == '__main__':
    main()


'''
Notes
- Pretty easy but im high af ...lol

Solution
1. Create a dictionary to store the nodes with values as keys
2. Create list to store the order 
3. Traverse tree and populate dictionary and list
4. Find the target Node and use index to find the next Node
5. Return that node to the user

'''
