def main():
    print("Hello World")
    nums = [1,2,3,4]
    solution = Solution()
    output = solution.runningSum(nums)
    print("Output: ", output)


class Solution(object):
    def runningSum(self, nums):
        print("Nums: ", nums)
        outputList = []
        lastTotal = 0;

        for i in nums:
            print(i)
            addition = int(lastTotal) + int(i)
            outputList.append(addition)
            lastTotal = addition;

        return outputList



if __name__ == '__main__':
    main()