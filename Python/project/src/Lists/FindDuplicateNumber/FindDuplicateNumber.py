class Solution(object):
    def findDuplicate_old(self, nums):
        numberSet = set()

        for num in nums:
            print("Current: ", num)
            if num in numberSet:
                return num

            numberSet.add(num)

    def findDuplicate(self, nums):
        numberSet = "|"

        for num in nums:
            print("Current: ", num)
            if ("|" + str(num) + "|") in numberSet:
                return num

            numberSet = "".join([numberSet, str(num),"|"])


def main():
    nums = [1, 3, 4, 2, 2]
    nums1 = [3, 1, 3, 4, 2]
    nums2 = [1, 1, 2]
    nums3 = [14,16,12,1,16,17,6,8,5,19,16,13,16,3,11,16,4,16,9,7]

    solution = Solution()
    output = solution.findDuplicate(nums3)
    print("Duplicate #: ", output)


if __name__ == '__main__':
    main()

'''
Notes 
- Super Easy

Solution
1. Create a set
2. Traverse input array
3. If current # is in set, return current num
    > Else, add current num to set

'''