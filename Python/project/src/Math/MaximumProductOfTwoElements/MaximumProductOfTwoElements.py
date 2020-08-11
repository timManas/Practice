class Solution(object):
    def maxProduct(self, nums):

        # Step1 - Sort Array
        nums.sort()
        print(nums)

        # Step2 - Array is now sorted.
        # Find the last two elements (largest) and calculate product
        output = (nums[nums.__len__() - 1] -1) * (nums[nums.__len__() - 2] - 1)

        return output

def main():
    # nums = [3,4,5,2]
    nums = [1, 5, 4, 5]
    solution = Solution()
    output = solution.maxProduct(nums)
    print("MaxProduct: " + str(output))


if __name__ == '__main__':
    main()


'''
Notes
- Way to Easy

Solution
1. Sort Array
2. Find the last two elements
3. Calculate the product

'''