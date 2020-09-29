from TreeNodeObject import Node

class Solution(object):
    def maxDepth(self, root):

        # Step1 - Check if there is even any values
        if root == None:
            return 0

        # Step2 - Traverse Nary Tree
        maxDepth = self.traverseTree(root, 1)
        return maxDepth

    def traverseTree(self, node, depth):

        # Setp1 - Check if node is null
        if node == None:
            print ("None is Null : Leaf Depth: ", depth)
            return depth

        # Step2 - Check if LeadNode
        # Return depth
        childList = node.children
        if childList == None:
            print ("Leaf Depth: ", depth)
            return depth

        # Step3 - Traverse Child Node and find the maxDepth
        maxDepth = depth
        for childNode in childList:
            print("ChildNode: ", childNode.val, "   Depth: ", depth + 1)
            childDepth = self.traverseTree(childNode, depth + 1)

            if maxDepth < childDepth:
                maxDepth = childDepth


        return maxDepth



def main():
    t11 = Node(1)
    t12 = Node(3)
    t13 = Node(2)
    t14 = Node(4)
    t15 = Node(5)
    t16 = Node(6)

    list1 = [t12, t13, t14]
    t11.children = list1

    list2 = [t15, t16]
    t12.children = list2

    solution = Solution()
    output = solution.maxDepth(t11)
    print ("Max Depth: ", output)


if __name__ == '__main__':
    main()

'''
Note:
- Easy peasy
- Use PreOrder DFS

Solution
1. Traverse the tree child Node
2. Compare the maxDepth of the tree to the childNode depths
3. Return the maxDepth with deepest path

'''