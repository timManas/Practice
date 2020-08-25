from TreeNodeObject import TreeNode

class Solution(object):
    def mergeTrees(self, treeNode1, treeNode2):

        outputNode = None

        # Create Queues for Tree
        queue1 = []
        queue2 = []

        head1 = TreeNode()
        head1.left = treeNode1

        head2 = TreeNode()
        head2.left = treeNode2

        queue1.append(head1)
        queue2.append(head2)

        while queue1.__len__() > 0 or queue2.__len__() > 0:
            print("Queue1: ", queue1,  "    Queue2: ", queue2)

            node1 = queue1.pop() if queue1.__len__() > 0 else None
            node1Left = node1.left.val if node1 != None and node1.left != None else 0
            node1Right = node1.right.val if node1 != None and node1.right != None else 0

            node2 = queue2.pop() if queue2.__len__() > 0 else None
            node2Left = node2.left.val if node2 != None and node2.left != None else 0
            node2Right = node2.right.val if node2 != None and node2.right != None else 0

            print("Node1: ", node1, "    Node2: ", node2)

            # if outputNode == None:
            newNode = TreeNode()

            newNode.left = TreeNode(node1Left + node2Left)
            newNode.right = TreeNode(node1Right + node2Right)

            # Add Children to Node

            if node1 != None:
                if node1.left != None:
                    queue1.append(node1.left)
                if node1.right != None:
                    queue1.append(node1.right)

            if node2 != None:
                if node2.left != None:
                    queue2.append(node2.left)
                if node2.right != None:
                    queue2.append(node2.right)

            outputNode = newNode

        print("Output: ", outputNode)




def main():
    t11 = TreeNode(1)
    t12 = TreeNode(3)
    t13 = TreeNode(2)
    t14 = TreeNode(5)

    t11.left = t12
    t11.right = t13
    t12.left = t14

    t21 = TreeNode(2)
    t22 = TreeNode(1)
    t23 = TreeNode(3)
    t24 = TreeNode(4)
    t25 = TreeNode(7)

    t21.left = t22
    t21.right = t23
    t22.right = t24
    t23.right = t25



    solution = Solution()
    output = solution.mergeTrees(t11, t21)
    print("MergedTrees: ", output)


if __name__ == '__main__':
    main()