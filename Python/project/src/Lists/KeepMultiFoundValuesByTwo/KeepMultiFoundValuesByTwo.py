from typing import List

def main():
    nums = [5, 3, 6, 1, 12]
    original = 3

    solution = Solution()
    output = solution.findFinalValue(nums, original)
    print("Find Final Value: " + str(output))


class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        print("Finding Final Value")

        val = original
        nums.sort()
        print("Sorted: " + str(nums))

        while True:

            if val in nums:
                i = nums.index(val)
            else:
                break

            current = nums[i]
            print("i: " + str(i) + "    current: " + str(current))

            val = current * 2

        return val

if __name__ == "__main__":
    main()