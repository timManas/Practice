from TreeNodeObject import TreeNode
from collections import deque

class Solution(object):
    def maxDepth(self, node):

        # Step1 - Create variable for output
        count = 0

        # Step2 - Rrturn 0 if node is zero
        if node == None:
            return count

        # Step3 - Create mainQueue and tempQueue
        mainQueue = deque()
        mainQueue.append(node)
        tempQueue = deque()

        # Step4 - Traverse through tree using BFS
        while mainQueue.__len__() > 0 or tempQueue.__len__() > 0:

            # Step5 - Traverse through the main queue to go through the current level
            while mainQueue.__len__() > 0:
                currentNode = mainQueue.popleft()
                left = currentNode.left
                right = currentNode.right

                if left != None:
                    tempQueue.append(left)

                if right != None:
                    tempQueue.append(right)


            # Step6 - Move elements from TempQueue to mainQueue
            while tempQueue.__len__() > 0:
                currentNode = tempQueue.popleft()
                mainQueue.append(currentNode)


            # Step7 - Update the count
            count += 1
            print("Count: ", count)


        return count



def main():
    t11 = TreeNode(3)
    t12 = TreeNode(9)
    t13 = TreeNode(20)
    t14 = TreeNode(15)
    t15 = TreeNode(7)

    t11.left = t12
    t11.right = t13

    t13.left = t14
    t13.right = t15

    solution = Solution()
    output = solution.maxDepth(t11)
    print("Max Depth: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Simple but needs some thinking
- Use BFS Tree traversal

Solution 
1. Create two queues
    - MainQueue: to store all the elements of the current
    - TempQueue: to store all the childElements of the mainQueue
2. Once we finish traversing the mainQueue, we put all the nodes in the tempQueue to the mainqQueue
3. Append the count after finishing go through the mainQueue

'''