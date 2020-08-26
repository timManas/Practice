from TreeNodeObject import TreeNode
from collections import deque

class Solution(object):
    def mergeTrees(self, treeNode1, treeNode2):

        if treeNode1 == None and treeNode2 == None:
            return
        elif treeNode1 == None and treeNode2 != None:
            mergedTree = TreeNode(treeNode2.val)
        elif treeNode1 != None and treeNode2 == None:
            mergedTree = TreeNode(treeNode1.val)
        else:
            mergedTree = TreeNode(treeNode1.val + treeNode2.val)


        # Create Queues for Tree
        queue1 = deque()
        queue2 = deque()
        queueMain = deque()

        queue1.append(treeNode1)
        queue2.append(treeNode2)
        queueMain.append(mergedTree)

        while queue1.__len__() > 0 or queue2.__len__() > 0:

            node1 = queue1.popleft() if queue1.__len__() > 0 else None
            node1Left = node1.left.val if node1 != None and node1.left != None else 0
            node1Right = node1.right.val if node1 != None and node1.right != None else 0

            node2 = queue2.popleft() if queue2.__len__() > 0 else None
            node2Left = node2.left.val if node2 != None and node2.left != None else 0
            node2Right = node2.right.val if node2 != None and node2.right != None else 0

            if queueMain.__len__() > 0:
                nodeMain = queueMain.popleft()
            else:
                nodeMain = TreeNode()
                mergedTree = nodeMain



            print("Node1: ", node1, "    Node2: ", node2)


            # Create child Nodes
            if (node1Left + node2Left) > 0:
                nodeMain.left = TreeNode(node1Left + node2Left)
                queueMain.append(nodeMain.left)

            if (node1Right + node2Right) > 0:
                nodeMain.right = TreeNode(node1Right + node2Right)
                queueMain.append(nodeMain.right)

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

            print("QueMain: ", nodeMain.val, "\n")

        print("Output: ", mergedTree)

        return mergedTree



def main():
    # t11 = TreeNode(1)
    # t12 = TreeNode(3)
    # t13 = TreeNode(2)
    # t14 = TreeNode(5)
    #
    # t11.left = t12
    # t11.right = t13
    # t12.left = t14
    #
    # t21 = TreeNode(2)
    # t22 = TreeNode(1)
    # t23 = TreeNode(3)
    # t24 = TreeNode(4)
    # t25 = TreeNode(7)
    #
    # t21.left = t22
    # t21.right = t23
    # t22.right = t24
    # t23.right = t25

    t11 = TreeNode()
    t21 = TreeNode()



    solution = Solution()
    output = solution.mergeTrees(t11, t21)
    print("MergedTrees: ", output.val)


if __name__ == '__main__':
    main()