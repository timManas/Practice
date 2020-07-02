def main():
    print("Hello World")
    nums = [1,2,3,4]
    solution = Solution()
    output = solution.runningSum(nums)
    print("Output: ", output)


class Solution(object):
    def runningSum(self, nums):
        print("Nums: ", nums)

        # Step1 : Create output variable to return
        outputList = []

        # Step2: Create var to keep track of the last number calculated
        lastTotal = 0;

        # Step3: Traverse through nums array
        for i in nums:
            print(i)
            addition = int(lastTotal) + int(i)
            outputList.append(addition)
            lastTotal = addition;

        return outputList



if __name__ == '__main__':
    main()