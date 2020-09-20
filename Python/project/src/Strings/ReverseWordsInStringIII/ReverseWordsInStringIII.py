class Solution(object):
    def reverseWords(self, input):
        output = ""

        # Step1 - Split String by Spaces
        stringArr = input.split(" ")
        print("String Arr: ", stringArr)

        # Step2 - Reverse and Combine each word in array
        for word in stringArr:
            output = "".join([output, word[::-1]]) + " "

        return output.rstrip()

def main():
    s = "Let's take LeetCode contest"
    solution = Solution()
    output = solution.reverseWords(s)
    print("Reverse String: " + output)


if __name__ == '__main__':
    main()


'''
Notes
- Super easy

Solution
1. Split the string using the spaces
2. Reverse each word in the Array and Join together
3. Add a Space afte each word
4. Return output


'''