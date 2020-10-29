class Solution(object):
    def pivotIndex(self, nums):

        leftSum = 0
        rightSum = 0

        leftIndex = 0
        rightIndex = nums.__len__() - 1

        if nums.__len__() <= 2:
            return -1

        while leftIndex < rightIndex:

            if leftSum == rightSum and leftSum != 0 and rightSum != 0:

                if leftIndex + 1 >= rightIndex:
                    return -1

                return leftIndex + 1

            elif nums[leftIndex] == 0:
                leftIndex += 1

            elif nums[rightIndex] == 0:
                rightIndex -= 1

            elif leftSum < rightSum:
                leftSum += nums[leftIndex]
                leftIndex += 1

            elif leftSum > rightSum:
                rightSum += nums[rightIndex]
                rightIndex -= 1

            print("Left Sum: ", leftSum, "      Right Sum: ", rightSum)

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