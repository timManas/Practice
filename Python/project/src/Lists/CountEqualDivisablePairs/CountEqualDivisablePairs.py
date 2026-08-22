from typing import List


def main():
    nums = [3, 1, 2, 2, 2, 1, 3]
    k = 2
    solution = Solution()
    print("Count: " + str(solution.countPairs(nums, k)) + "\n")


class Solution:
    def countPairs(self, nums: List[int], k: int) -> int:
        count = 0

        for i in range(0, nums.__len__()-1):
            current = nums[i]

            for j in range(i+1, nums.__len__()):
                nextV = nums[j]

                print("current: " + str(current) + "    next: " + str(nextV))
                print(" i: " + str(i) + "    j: " + str(j))

                if current == nextV and (i * j) % k == 0:
                    print(" hit")
                    count += 1




        return count

if __name__ == "__main__":
    main()