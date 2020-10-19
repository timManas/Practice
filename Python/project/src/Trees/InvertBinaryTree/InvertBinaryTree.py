from TreeNodeObject import TreeNode

class Solution(object):
    def invertTree(self, node):
        return self.traverseTree(node)

    def traverseTree(self, node):

        # Step1 - Check if node is null
        if node == None:
            return

        # Step2 - Traverse left and right Subtree
        left = self.traverseTree(node.left)
        right = self.traverseTree(node.right)
        print("Current Node: ", node.val)

        # Step3 - Invert the tree
        node.left = right
        node.right = left

        return node


def main():
    t11 = TreeNode(4)
    t12 = TreeNode(2)
    t13 = TreeNode(7)
    t14 = TreeNode(1)
    t15 = TreeNode(3)
    t16 = TreeNode(6)
    t17 = TreeNode(9)

    t11.left = t12
    t11.right = t13

    t12.left = t14
    t12.right = t15

    t13.left = t16
    t13.right = t17

    solution = Solution()
    output = solution.invertTree(t11)
    print("Inverted Tree: ", output.val)

if __name__ == '__main__':
    main()


'''
Notes
- Uses DFS Post Order Traversal
- Getting really good at it 

Solution 
1. Traverse tree using DFS Post order traversal
2. Traverse left and right nodes until the end
3. Once we are at the parent of the leaf Nodes, we invert them
4. Return the node 


'''