class Solution(object):
    def pivotIndex(self, nums):

        totalSum = 0

        leftSum = 0
        rightSum = 0

        leftIndex = 0
        rightIndex = nums.__len__() - 1

        if nums.__len__() <= 2:
            return -1

        # Find the total
        # Need this to calculate the Right Sum
        i = 0
        while i < nums.__len__():
            totalSum += nums[i]
            i += 1

        while leftIndex < rightIndex:
            left = nums[leftIndex]
            leftSum += left

            right = nums[rightIndex]
            rightSum += right

            print("Left Sum: ", leftSum, "      Right Sum: ", rightSum)

            if leftSum == (totalSum - rightSum):
                return leftIndex + 1


            leftIndex += 1
            rightIndex -= 1




        return -1

def main():
    # nums = [1, 7, 3, 6, 5, 6]
    # nums = [1, 2, 3]
    nums = [-1, -1, -1, -1, -1, 0]

    solution = Solution()
    output = solution.pivotIndex(nums)
    print("Pivot Index: ", output)

if __name__ == '__main__':
    main()