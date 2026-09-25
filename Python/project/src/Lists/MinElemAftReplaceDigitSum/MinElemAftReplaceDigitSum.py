from ast import List


def main():
    solution = Solution()
    input = [[10,12,13,14], [1,2,3,4], [999,19,199]]
    for num in input:
        print("minElement: ", solution.minElement(num), "\n")
    return

class Solution:
    def minElement(self, nums: List[int]) -> int:
        minElement = 200
        for num in nums:
            sum = 0
            for digit in str(num):
                sum += int(digit)

            minElement = min(sum, minElement)


        return minElement

if __name__ == "__main__":
    main()