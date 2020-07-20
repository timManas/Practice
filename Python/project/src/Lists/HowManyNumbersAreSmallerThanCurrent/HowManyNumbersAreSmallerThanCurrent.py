def main():

    nums = [8,1,2,2,3]
    solution = Solution()
    output = solution.smallerNumbersThanCurrent(nums)
    print("# Nums: ", output)


class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        print("Starting Find # of Smaller Numbers")

        # Step1: Create output variable to store # of smaller numbers
        output = []

        # Step2: Sort the array
        sortedNums = sorted(nums)
        print("Sorted: ", sortedNums)
        print("UnSorted: ", nums)

        # Step3: Travere the input list
        for i in range(nums.__len__()):

            # Step4: Find the Index of the sorted list and place them in output list
            print(sortedNums.index(nums[i]))
            output.append(sortedNums.index(nums[i]))

        # Step4: Return the output
        return output


if __name__ == '__main__':
    main()

'''
Solution
1. Sort the input list
    > Why ? Because the sorted list will contain how many Elements are Smaller !!!
2. Traverse the input list
3. For each value in the inputlist, we find the element in the sortted list and find its index
4. Place the index in the output list =)


'''