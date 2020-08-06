class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def getDecimalValue(self, head):

        # Step1 - Create output variable
        stringBinary = ""

        # Step2 - Traverse head Node
        while head != None:

            # Step3 - Concatenaet Head
            stringBinary += str(head.val)

            # Step4 - Set head to next node
            head = head.next
        print("StringBinary: " + stringBinary)

        # Step5 - Convert to int
        output = int(stringBinary, 2)
        return output


def main():
    node1 = ListNode(1)
    node2 = ListNode(0)
    node3 = ListNode(1)

    node1.next = node2
    node2.next = node3

    solution = Solution()
    output = solution.getDecimalValue(node1)
    print("Output: ", output)

if __name__ == '__main__':
    main()

'''
Notes
- Super easy

Solution
1. Traverse LinkedList
2. Concatenate each nodes value to a string
3. Convert String to Int
4. Return int
'''