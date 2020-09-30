from ListNodeObject import ListNode

class Solution(object):
    def reverseBetween(self, node, m, n):
        head = None
        return head

def main():

    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node4 = ListNode(4)
    node5 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5

    m = 2
    n = 4

    solution = Solution()
    output = solution.reverseBetween(node1, m, n)


if __name__ == '__main__':
    main()