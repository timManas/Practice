class Solution(object):
    def replaceElements(self, arr):

        # Step1 - Create output variable
        output = []

        # Step2 - Create counter to keep track of largest index
        largest = -1

        # Step3 - Traverse Array in reverse
        i = arr.__len__() - 1
        while i >= 0:
            print("Current:" , arr[i])

            # Step4 - Append the largest value to output array
            output.append(largest)

            # Step5 - Update the largest value if current is bigger
            if largest < arr[i]:
                largest = arr[i]


            i -= 1      # Decrement counter index

        # Step6 - Reverse output
        output.reverse()
        return  output


def main():
    arr = [17, 18, 5, 4, 6, 1]
    solution = Solution()
    output = solution.replaceElements(arr)
    print("Output: ", output)


if __name__ == '__main__':
    main()



'''
Notes
- Easy as pie

Solution
1. Start from the Right to left when traversing array
2. Keep a counter for the largest value
3. Append the output array with the largest value
4. Reverse the output array


'''