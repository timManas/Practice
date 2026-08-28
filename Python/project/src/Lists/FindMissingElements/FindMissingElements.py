from typing import List


def main():
    input = [[1,4,2,5], [7,8,6,9], [5,1]]
    for i, row in enumerate(input):
        solution = Solution()
        print("findMissingElements: " + str(solution.findMissingElements(row)) + "\n")


class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        output = []
        nums.sort()
        print("nums: " + str(nums))

        min = nums[0]
        max = nums[len(nums)-1]

        for num in range(min+1, max):
            print("     i: " + str(num))
            if num not in nums:
                output.append(num)


        return output


if __name__=="__main__":
    main()