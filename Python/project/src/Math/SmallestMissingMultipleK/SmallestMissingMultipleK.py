from ast import List


def main():
    solution = Solution()
    nums = [8, 2, 3, 4, 6]
    k = 2
    print("missing Value: ", solution.missingMultiple(nums, k), "\n")

    nums = [1,4,7,10,15]
    k = 5
    print("missing Value: ", solution.missingMultiple(nums, k), "\n")


    return


class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        missing = 0

        nums.sort()

        multiple = 1
        while multiple < 100:
            value = k * multiple

            if value not in nums:
                return value

            multiple += 1

        return 101 if missing == 0 else 0

if __name__ == "__main__":
    main()