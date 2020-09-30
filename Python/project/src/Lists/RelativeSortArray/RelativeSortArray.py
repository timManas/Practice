class Solution(object):
    def relativeSortArray(self, inputArr, refArr):

        # Step1 - Create output arr and diffArr
        output = []
        diff = []

        # Step2 - Populate the output Arr by populating based off the refArr
        for refNum in refArr:
            numOccurence = inputArr.count(refNum)
            print("RefNum: ", refNum, "         Num Occurence: ", numOccurence)
            while numOccurence > 0:
                output.append(refNum)
                numOccurence -= 1

        # Step3 - Find the diff between output and inputArr
        for num in inputArr:
            if num not in output:
                diff.append(num)

        # Step4 - Combine the two arrays and return
        diff.sort()
        output += diff

        return output


def main():
    arr1 = [2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19]
    arr2 = [2, 1, 4, 3, 9, 6]
    solution = Solution()
    output = solution.relativeSortArray(arr1, arr2)
    print("Relative Sort: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Pretty Easy


Solution
1. Create two arrays: Output and diff
2. Traverse the refArr and populate the outputArr based on order of the refArr
3. Find the difference between the outputArr and the inputArr
    - Both shoulhd have the same size
4. Combine both arrays and return
'''