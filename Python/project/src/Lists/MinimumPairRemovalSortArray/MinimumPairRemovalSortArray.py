from ast import List
from xmlrpc.client import boolean


def main():

    solution = Solution()
    input = [[5,2,3,1], [1,2,2], [-2,1,2,-1,-1,-2,-2,-1,-1,1,1], [260,-203,241,495,554,-174,476,-574,531,-526,-518,14,-541,24,606,-394,-515,103,413,565,426,-295,682,366]]
    for arr in input:
        print("Min Pair Removal: ", solution.minimumPairRemoval(arr), "\n")

    return





class Solution:
    def minimumPairRemoval(self, nums: List[int]) -> int:
        minPairRemoval = 0

        while (not self.isSorted(nums)):
            print("     list: ", nums)

            min = float('inf')
            lastMinindex = 0
            for i in range(len(nums)-1) :
                current = nums[i]
                next = nums[i+1]
                sum = current + next

                if min > sum:
                    min = sum
                    lastMinindex = i

            #Update the array
            nums[lastMinindex] = min
            del nums[lastMinindex+1]

            minPairRemoval += 1






        return minPairRemoval

    def isSorted(self, nums: List[int]) -> bool:

        for i in range(len(nums) - 1):
            if nums[i] > nums[i+1]:
                return False

        return True

if __name__ == '__main__':
    main()
