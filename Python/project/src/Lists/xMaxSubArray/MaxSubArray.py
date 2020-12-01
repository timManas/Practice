import sys


class Solution(object):
    def maxSubArray(self, nums):
        currentMax = nums[0]
        globalMax = nums[0]

        # Step1 - Traverse the input array one by one
        i = 1
        while i < nums.__len__():

            # Step2 - Calculate the currentMax & GlobalMax
            currentMax = max(currentMax + nums[i], nums[i])     # We are comparing:  (currentMax + current Element) Vs. (CurrentElement)
            globalMax = max(currentMax, globalMax)

            print("Current: ", nums[i], "   CurrentMax: ", currentMax, "    GlobalMax: ", globalMax)
            i += 1

        return globalMax



def main():
    nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    solution = Solution()
    output = solution.maxSubArray(nums)
    print("MaxSubArray: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Definitely HARD 10/10
- Not my solution. 
- Uses Kadane Algorithm
- Tricky AF

Solution
1. Traverse the input array, one at a time
2. Find the currentMax by finding the max of either (currentMax + current Element) OR (currentElement)
3. Keep track of the globalMax
4. Return the GlobalMax 

'''