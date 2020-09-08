from TreeNode import Node

class Solution(object):
    def postorder(self, node):

        # Step1 - Create output variable
        output = []

        # Step2 - Traverse Tree
        self.traverseTree(node, output)

        return output



    def traverseTree(self, node, output):
        # Step1 - Check if current Node is null ...Return back
        if node is None:
            return

        # Step2 - Check if childREN Exists
        childList = node.children
        if childList is None:
            output.append(node.val)
            return

        # Step3 - Traverse All children of Node first
        # Why ? For Post order traversal
        for childNode in childList:
            self.traverseTree(childNode, output)

        # Step4 - Append Current Node val to output List
        print("CurrentNode.Val: ", node.val)
        output.append(node.val)




def main():

    t11 = Node(1)
    t12 = Node(3)
    t13 = Node(2)
    t14 = Node(4)
    t15 = Node(5)
    t16 = Node(6)

    list1 = []
    list1.append(t12)
    list1.append(t13)
    list1.append(t14)

    list2 = []
    list2.append(t15)
    list2.append(t16)

    t11.children = list1
    t12.children = list2


    solution = Solution()
    output = solution.postorder(t11)
    print("Root Node: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Easy but im kinda brain farting right now
- Use post order traversal 

Solution
1. Check if node exists, return back if not
2. Traverse nodes children if exist
3. Continue until all ndoes are reached


'''