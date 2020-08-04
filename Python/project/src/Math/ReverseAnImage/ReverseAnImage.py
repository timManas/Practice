

class Solution(object):
    def flipAndInvertImage(self, A):
        print("Original: ", A, "\n")

        # Step1 -  Flip Image horizontally
        self.flipImage(A)
        print("FlipA: ", A)

        # Step2 -  Invert Image
        self.invertImage(A)
        print("InvertA: ", A, "\n")

        # BonusStep - Combine Both together
        self.flipAndReverse(A)
        print("Flip N Reversed: ", A)

        return A


    # Flip Image
    # Use Reverse function
    def flipImage(self, A):
        for subArray in A:
            subArray.reverse()
        return A

    # Invert image
    # Use Invert Image
    def invertImage(self, A):
        for subArray in A:
            for i in range(subArray.__len__()):
                if subArray[i] == 0:
                    subArray[i] = 1
                else:
                    subArray[i] = 0
        return A

    def flipAndReverse(self, A):
        for subArray in A:
            for i in range(subArray.__len__()):
                if subArray[i] == 0:
                    subArray[i] = 1
                else:
                    subArray[i] = 0
            subArray.reverse()

        return A


def main():
    A = [[1,1,0],[1,0,1],[0,0,0]]
    solution = Solution()
    output = solution.flipAndInvertImage(A)
    print("Output: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Slightly Tricky

Solution
1. Reverse A by using 'reverse()' method
2. Flip A by traversing each element and flipping between 0 and 1

'''