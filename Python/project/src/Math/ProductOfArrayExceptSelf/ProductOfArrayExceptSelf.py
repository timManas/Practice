class Solution(object):
    def productExceptSelf(self, nums):

        # Step1 - Create output List, leftSumList, RightSumList
        output = []
        leftSumList = []
        rightSumList = []

        # Step2 - Initialize the Sum Totals
        leftSum = 1
        rightSum = 1

        # Step3 - Populate the leftSumList by Moving from Left to Right
        index = 0
        while index < nums.__len__():
            print("Current: ", nums[index])

            if index == 0:
                leftSumList.append(1)
            else:
                leftSum = nums[index - 1] * leftSum
                leftSumList.append(leftSum)

            index += 1
        print("LeftSumList: ", leftSumList)

        # Step4 - Populate the rightSumList by Moving from Right to Left
        index = nums.__len__() - 1
        while index >= 0:
            print("Current: ", nums[index])

            if index == nums.__len__() - 1:
                rightSumList.append(1)
            else:
                rightSum = nums[index + 1] * rightSum
                rightSumList.append(rightSum)

            index -= 1
        rightSumList.reverse()
        print("RightSumList: ", rightSumList)

        # Step5 - Calculate the Product Together and append to outputList
        index = 0
        while index < nums.__len__():
            output.append(leftSumList[index] * rightSumList[index])
            index += 1

        return output

def main():
    nums = [1, 2, 3, 4]
    solution = Solution()
    output = solution.productExceptSelf(nums)
    print("Output: ", output)

if __name__ == '__main__':
    main()


'''
Notes
- Very difficult Logic to understand
- Basically, the trick is to create TWO list which stores the sum of the elemenets from the left and right
- Then we multiple leftSumList elements with the RightSumList Elements

Ex:
Input:      1   2   3   4
-----------------------------
LeftSum:    1   1   2   6   
RightSum:   24  12  8   6
-----------------------------
Product:    24  12  8   6

Solution
1. Create output List,  list for storing Left Products, List for storign Right Products
2. Populate the LeftSumList by moving from left to right
3. Populate the RightSumList by moving from right to left
4. Multipy the elements of LeftSumList and RightSumList and store in OutputList
5. Return outputList


'''