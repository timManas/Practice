class Solution(object):
    def removeOuterParentheses(self, input):

        # Step1 - Create output variable
        output = ''

        # Step2 - Find the Primitive Decomposition List
        primitiveDecompositionList = self.getPrimitiveDecomposition(input)

        # Step3 - Traverse list and remove the outer paranthesis
        for primDecom in primitiveDecompositionList:
            innerBracket = primDecom[1:primDecom.__len__() - 1]
            output = ''.join((output,innerBracket))



        return output


    '''
        The wat this works is that we keep track of the open and close brackets
        Once the openCount and closeCount ARE THE SAME ...Then this is a PRIMITIVE Decompoistion
            > We then take the Substring from startIndex until i and put in List to be returned
        If not the same, we incrememnt the open and close Count
    '''
    def getPrimitiveDecomposition(self, input):

        # Step1 - Create outout array  to return
        output = []

        # Step2 - Create open and close counters to count and starting Positions
        openCount = 0;
        closeCount = 0;
        startIndex = -1;

        # Step3 - Traverse input
        for i in range(input.__len__()):
            letter = input[i]

            # We fetch the first non Null position
            if startIndex == -1:
                startIndex = i

            # Step4 - Incrememt the counter
            if letter == '(':
                openCount += 1
            elif letter == ')':
                closeCount += 1

            # Step5 - Check if the open and close counts are the same
            # Append the primitive decomp to the list
            # Reset the counters and starting Index
            if (openCount != 0 and closeCount != 0 and openCount == closeCount):
                output.append(input[startIndex: i +1])
                openCount = 0
                closeCount = 0
                startIndex = -1

        print("Primitive Decomp List: ", output)


        return output


def main():
    input = ["(()())(())", "(()())(())(()(()))", "()()"]
    solution = Solution()

    for i in input:
        output = solution.removeOuterParentheses(i)
        print("Removed Outer Paranthesis: " + output +  "\n")



if __name__ == '__main__':
    main()

'''
 Notes
 - DEFINITELY NOT EASY AT ALL

 Solution
 1. Seperate String input into primitive decomposition
    How ?
    > We keep count of the Open and Close bracket
    > Once the open and close bracket are the same ... we take the Substring from startIndex till i
    > This is a primitive decompostion
 2. Once we have list of primitive decomposition:
    > We take inner brackets and place them in StringBuilder
 3. Return the String of StringBuilder


'''