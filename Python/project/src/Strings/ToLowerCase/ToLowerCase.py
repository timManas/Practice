class Solution:
    def toLowerCase(self, str: str) -> str:
        # Step1 - Create output variable
        output = ""

        # Step2 - Traverse String
        for letter in str:

            # Step3 - Convert each letter to char and add 32
            number = ord(letter) + 32
            upper = chr(number)

            # Step4 - Append the lower case letter to the output variable
            output += upper

        return output


def main():
    str = "LOVELY"
    solution = Solution()
    output = solution.toLowerCase(str)
    print("LowerCase: " + output)



if __name__ == '__main__':
    main()


'''
Notes
- Not tricky

Solution
1. Traverse the string 
2. For each letter, convert to char and add 32 ...why ? because the ascii chart, if we add 32 we convert the char to lowercase
3. Append the char to the output variable in lowercase
4. Return output variable

'''