class Solution(object):
    def productExceptSelf(self, nums):
        output = []

        # Find the total
        index = 0
        total = nums[0]
        while index < nums.__len__():
            total *= nums[index]
            index += 1
        print("Total: ", total)


        return output

def main():
    nums = [1, 2, 3, 4]
    solution = Solution()
    output = solution.productExceptSelf(nums)
    print("Output: ", output)

if __name__ == '__main__':
    main()