def main():
    solution = Solution()
    input = [[0, 1, 0, 3, 12], [0, 1, 0, 2], [1, 2, 0]]
    for i,list in enumerate(input):
        print("minSweep: ", solution.minimumSwaps(list), "\n")


class Solution:
    def minimumSwaps(self, nums: list[int]) -> int:
        min = 0

        numZeroes = 0
        for num in nums:
            if num == 0:
                numZeroes += 1
        print("numZeroes: ", numZeroes)

        for i,num in enumerate(reversed(nums)):

            if (numZeroes == 0):
                break

            numZeroes -= 1


            if (num == 0):
                continue

            min += 1



        return min

if __name__ == "__main__":
    main()