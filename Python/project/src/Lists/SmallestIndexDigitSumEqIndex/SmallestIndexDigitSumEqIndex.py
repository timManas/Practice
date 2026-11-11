from ast import List


def main():
    solution = Solution()

    input = [[1,3,2], [1,10,11], [1,2,3]]
    for nums in input:
        print(solution.smallestIndex(nums), "\n")


    return


class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        print(nums)

        smallest = 2**31 - 1

        for index,val in enumerate(nums):
            print("index: ", index, "   val:", val)

            sum = 0
            digits = list(str(val))
            for digit in digits:
                sum = sum + int(digit)

            print("     sum: ", sum)

            if sum == index:
                smallest = min(sum, smallest)


        if (smallest == 2**31 - 1):
            return -1


        return smallest

if __name__ == '__main__':
    main()
