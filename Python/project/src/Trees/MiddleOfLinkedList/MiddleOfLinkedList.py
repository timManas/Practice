from ListNodeObject import ListNode

class Solution(object):
    def middleNode(self, node):

        currentNode = node
        pointerDouble = node.next.next
        while currentNode != None and pointerDouble != None:
            print("Current Node:", currentNode.val, "  pointerDouble: ", pointerDouble.val)
            pointerDouble = pointerDouble.next.next
            currentNode = currentNode.next

        print("Current Node: ", currentNode.val)






def main():
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node4 = ListNode(4)
    node5 = ListNode(5)
    node6 = ListNode(6)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    # node5.next = node6

    solution = Solution()
    output = solution.middleNode(node1)
    print("Middle Node: ", output)

if __name__ == '__main__':
    main()