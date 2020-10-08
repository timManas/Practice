class Solution(object):
    def shortestToChar(self, stringInput, targetChar):
        output = []
        positionListOfTargetChar = []


        # Get the index of all target character
        for i in range(stringInput.__len__()):
            letter = stringInput[i]
            if letter == targetChar:
                positionListOfTargetChar.append(i)

        # Traverse string input and find the shortestToChar
        currentHighestPointer = 0
        for i in range(stringInput.__len__()):
            letter = stringInput[i]
            print ("Current Letter: " + letter)

            # If letter == targetChar, we move the currentHighestPointer to the next
            if letter == targetChar:
                currentHighestPointer += 1

                if currentHighestPointer >= positionListOfTargetChar.__len__():
                    currentHighestPointer = positionListOfTargetChar.__len__() - 1

                output.append(0)
                continue

            if currentHighestPointer == 0:
                output.append(abs(i - positionListOfTargetChar[currentHighestPointer]))
                continue

            # Calculate the Absolute Min value between Prev and Current Pointer
            prev = abs(i - (positionListOfTargetChar[currentHighestPointer - 1]))
            current = abs(i - positionListOfTargetChar[currentHighestPointer])
            output.append(min(prev, current))

        return output

def main():
    # S = "loveleetcode"
    # C = 'e'

    S = "aaba"
    C = "b"

    solution = Solution()
    output = solution.shortestToChar(S,C)
    print("Shortest distance for each letter: ", output)

if __name__ == '__main__':
    main()


'''
Notes
- Slightly Tricky but not really

Solution
1. Create a list of all index of the  target Character
2. Traverse the String letter by letter:
- If letter is targetChar, we move the currentPointer to the next
- For each letter, fetch the prev and current INDEXes
- Append the smallest of the two in the output List


'''