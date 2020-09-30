from ListNodeObject import ListNode

class Solution(object):
    def middleNode(self, node):

        # Step1 - Create SlowPointer and FastPointer
        currentPointer = node
        fastPointer = node

        # Step2 - Traverse LinkedList using fastPointer
        while fastPointer != None and fastPointer.next != None:
            print("Current Node:", currentPointer.val, "  pointerDouble: ", fastPointer.val)

            # Step3 - Update pointers
            fastPointer = fastPointer.next.next         # Move pointer by two
            currentPointer = currentPointer.next        # Move pointer by one


        return currentPointer




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
    print("Middle Node: ", output.val)

if __name__ == '__main__':
    main()

'''
Notes
- A bit tricky. Still needed some help

Solution
1. Create two pointers. Slow and fast pointer
- Slow pointer will only traverse the list by one
- Fast pointer will only traverse the list by two

2. Stop the loop until the fastpointer is null or fastpointer.next is null
3. Return currentPointer

'''