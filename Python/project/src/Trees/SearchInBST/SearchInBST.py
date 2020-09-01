from TreeNodeObject import TreeNode


class Solution(object):
    def searchBST(self, node, val):


        if node == None:
            return

        print("CurrentNode: ", node.val)

        if node.val == val:
            return node
        elif node.val > val:
            return self.searchBST(node.left, val)
        elif node.val < val:
            return self.searchBST(node.right, val)

        return



def main():

    t1 = TreeNode(4)
    t2 = TreeNode(2)
    t3 = TreeNode(7)
    t4 = TreeNode(1)
    t5 = TreeNode(3)

    t1.left = t2
    t1.right = t3
    t2.left = t4
    t2.right = t5

    val = 5

    solution = Solution()
    output = solution.searchBST(t1, val)
    print("Node found: ", output.val)


if __name__ == '__main__':
    main()

'''
Notes
- Super Easy
- Use recursion to find target val

Solution
- Use Binary Search ...cmon thats easy
- Algo of Binary Search:
    1. Check if current Node == val
        - Return node
    2. Check if current Node > val
        - Check left child Node
    3. Check if Current Node < val
        - Check right child node
    


'''