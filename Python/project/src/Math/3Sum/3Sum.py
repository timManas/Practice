class Solution(object):
    def threeSum(self, nums):

        # Step1 - Create output array
        output = []

        # Step2 - Create set
        traversedSet = set()        # Store all elements traversed
        valueSet = set()            # Store all combinations of Elements which add up to 0


        # Step3 - Sort the input array
        nums.sort()
        print("Sorted: ", nums)

        # Step4 - Traverse the input array one by on
        for index in range(nums.__len__()):
            currentNum = nums[index]
            print("Current: ", currentNum)

            # Step5 - If Element already traversed, move on
            if currentNum in traversedSet:
                continue

            # Step6 - Fetch 3Sums
            self.fetchSums(nums, index, output, valueSet)
            traversedSet.add(currentNum)                    # Add element to traversedSet

        return output

    def fetchSums(self, nums, index, output, valueSet):

        # Step1 - Fetch low and high
        low = index + 1
        high = nums.__len__() - 1

        # Step2 - Traverse the array
        while low < high:

            # Step3 - Fetch the total
            total = nums[index] + nums[low] + nums[high]

            if total == 0:              # If total == 0, Add to output list and combinaiton to valueSet
                print("Found 3Sum")

                strTotal = "".join([str(nums[index]), str(nums[low]), str(nums[high])])

                if strTotal not in valueSet:
                    newList = []
                    newList.append(nums[index])
                    newList.append(nums[low])
                    newList.append(nums[high])
                    output.append(newList)
                    valueSet.add(strTotal)

                low += 1

            elif total < 0:           # Increment low if total < 0
                low += 1

            elif total > 0:           # Decrement high if total > 0
                high -= 1



def main():
    nums = [-1, 0, 1, 2, -1, -4]
    nums2 = [0, 0, 0, 0]
    solution = Solution()
    output = solution.threeSum(nums)
    print("List of 3 Sums: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- RunTime is 0(n^2) at best

Solution
1. Sort the input Array
2. Create two sets 1. To Keep track of all element traveresd ...Why ? to avoid repetition
                    2. To keep track of all Elements which add up to 0
3. Traverse the input array one by one
4. Use two pointers (low & high) to
    - Calcualte total = nums[index] + nums[low] + nums[high]
5. If total == 0, then add to output List
6. If total < 0, increment low
7. If total > 0, decrement high

'''