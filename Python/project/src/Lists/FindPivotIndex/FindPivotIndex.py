class Solution(object):
    def pivotIndex(self, nums):

        # Step1 - Create Sum variables
        totalSum = 0
        leftSum = 0
        rightSum = 0


        # Step2 - Find the total
        # Need this to calculate the Right Sum
        index = 0
        while index < nums.__len__():
            totalSum += nums[index]
            index += 1

        # Step3 - Traverse the nums array from left to right
        index = 0
        while index < nums.__len__():

            # Calculate the Right Sum
            rightSum = totalSum - nums[index]

            # Step4 - Check if the left and Right Sum are equal
            if leftSum == rightSum:
                return index
            else:

                # Step5 - Update the leftSum and Decrement the totalSum
                leftSum += nums[index]
                totalSum -= nums[index]

            index += 1
            print("Left Sum: ", leftSum, "      Right Sum: ", rightSum)

        return -1

def main():
    # nums = [1, 7, 3, 6, 5, 6]
    # nums = [1, 2, 3]
    nums = [-1, -1, -1, -1, -1, 0]

    solution = Solution()
    output = solution.pivotIndex(nums)
    print("Pivot Index: ", output)

if __name__ == '__main__':
    main()

'''
Notes
- This was HARD af
- The trick is the rightSum = totalSum - nums[i]
- We can compare of left Sum == RightSum 

Solution
1. Find the total Sum
2. Traverse nums array from left to Right
3. Calculate the left and Right Sum:
    - For each elememnt, we update the leftSum and totalSum
    

'''