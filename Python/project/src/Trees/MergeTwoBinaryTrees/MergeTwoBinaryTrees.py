from TreeNodeObject import TreeNode

class Solution(object):
    def mergeTrees(self, t1, t2):
        print("t1: ", t1)




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