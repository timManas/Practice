def main():
    nums = [0, 1, 2, 3, 4]
    index = [0, 1, 2, 2, 1]
    solution = Solution()
    output = solution.createTargetArray(nums, index)
    print("Target Array: " + str(output))

class Solution(object):
    def createTargetArray(self, nums, index):
        # Step1 - Create output list
        output = []

        # Step2 - Traverse through list
        for i in range(nums.__len__()):
            # print("nums: ", str(nums[i]), "   Index: ", str(index[i]))
            number = nums[i]
            currentIndex = index[i]

            if output.__len__() == 0:
                output.append(number)
                continue

            # Step3 - Fetch the initial list and EndList
            startList = output[0 : currentIndex]
            endList = output[currentIndex: output.__len__()]
            print("StartList: ", startList, "   EndList: ", endList)

            # Step4 - Add new Element to list
            startList.append(number)

            # Step5 - Add second half of list
            output = startList + endList
            print("Combined: ", output)

        return output

if __name__ == '__main__':
    main()

'''
Notes
- A bit tricky but nothing crazy

Solution
1. Traverse the number list
2. For each number do:
- Split the output array into 2 subList startList & endList
- Add the new Element to the End of the start List
- Combine the the startList and EndList together
3. Repeat until finished

'''