import sys

class Solution(object):
    def minimumAbsDifference(self, arr):

        # Step1 - Create Output variable
        output = []

        # Step2 - Sort the Array
        arr.sort()
        print("Soretd Array: ", arr)

        # Step3 - Traverse list
        minDiff = sys.maxsize
        for i in range(arr.__len__()):
            if i == 0:
                continue

            print("Current: ", arr[i], "   Prev: ", arr[i - 1])

            # Step4 - Calculate Current Difference
            currentDiff = abs(arr[i] - arr[i-1])


            # Step5 - Check if MinDiff > currentDiff:
            # Add current and prev is true
            temp = []
            if minDiff == currentDiff:
                minDiff = currentDiff
                temp.append(arr[i-1])
                temp.append(arr[i])
                output.append(temp)
            elif minDiff > currentDiff:
                minDiff = currentDiff
                temp.append(arr[i - 1])
                temp.append(arr[i])
                output.clear()
                output.append(temp)


        return output


def main():
    # arr = [4, 2, 1, 3]
    # arr = [1,3,6,10,15]
    # arr = [3, 8, -10, 23, 19, -4, -14, 27]
    arr = [40,11,26,27,-20]
    solution = Solution()
    output = solution.minimumAbsDifference(arr)
    print("Min Abs Difference: ", output)

if __name__ == '__main__':
    main()


'''
Notes
- Quite Simple

Solution
1. Sort the array
2. Traverse the arrat from 1 to Arr.Length
3. Check if difference is smaller than current Difference
    > True ? Add both current and prev to tempList and add that to Outputlist
    > Delete existing list in output Node
3b. Check if difference is the same
    > True ? Add onto the output list


'''