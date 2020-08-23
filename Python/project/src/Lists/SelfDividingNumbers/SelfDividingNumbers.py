class Solution(object):
    def selfDividingNumbers(self, left, right):

        # Step1 - Create output variable
        output= []

        # Step2 - Traverse Array from left to Right
        for number in range(left, right + 1):

            # Step3 - Create a variable to add to output array
            isSelfDividing = True

            # Step4 - Create a list of individual digit list
            elementList = [int(i) for i in str(number)]
            print(elementList)

            # Step5 - Check if elementList contains 0
            # Continue list
            if 0 in elementList:
                continue

            # Step6 - Check if every digits is self dividing
            for element in elementList:
                if not(number % element == 0):
                    isSelfDividing = False
                    break

            # Step7 - Append Dividing number
            if isSelfDividing:
                output.append(number)

        return output


def main():
    left = 1
    right = 22
    solution = Solution()
    output = solution.selfDividingNumbers(left, right)
    print("Output: ", output)


if __name__ == '__main__':
    main()