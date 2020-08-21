class Solution(object):
    def sortArrayByParity(self, arr):

        # Step1 - Create output variable
        output = []

        # Step2 - Traverse arr
        for num in arr:
            print("Current: ", num)

            # Step3 - If odd -> Append, if even  -> Insert at beginning
            if num % 2 == 0:
                output.insert(0, num)
            else:
                output.append(num)

        return output


def main():
    A = [3,1,2,4]
    solution = Solution()
    output = solution.sortArrayByParity(A)
    print("Output: ", output)

if __name__ == '__main__':
    main()

'''
Notes
- Super easy

Solution
- Traverse through array
- If number is odd > Append
    if number is even > Insert at beginning of list

'''