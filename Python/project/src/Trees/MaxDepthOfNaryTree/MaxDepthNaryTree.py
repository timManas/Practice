from TreeNodeObject.py import Node

class Solution(object):
    def maxDepth(self, root):
        depth = 0

        return depth

def main():
    t11 = Node(1)
    t12 = Node(3)
    t13 = Node(2)
    t14 = Node(4)
    t15 = Node(5)
    t16 = Node(6)

    t11.left = t12
    t11.right = t13


    t12.left = t14

    solution = Solution()
    output = solution.maxDepth(t11)


if __name__ == '__main__':
    main()