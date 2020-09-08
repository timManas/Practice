from TreeNode import Node

class Solution(object):
    def preorder(self, root):

        # Step1 - Create output node
        output = []

        # Step2 - Traverse Tree
        self.traverseTree(root, output)
        return output

    def traverseTree(self, node, output):

        # Step1 - Check if node is null
        if node is None:
            return

        # Step2 - Add the curent node to output List
        print("CurrentNode: ", node.val)
        output.append(node.val)

        # Step3 - Traverse the child nodes
        childList = node.children
        if childList != None:
            for childNode in childList:
                self.traverseTree(childNode, output)




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
    output = solution.preorder(t11)
    print("PreOrderTraversal: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Super Easy
- Uses preOrder traversal


'''