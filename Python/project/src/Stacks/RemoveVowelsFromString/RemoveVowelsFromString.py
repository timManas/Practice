def main():
    input = 'leetcodeisacommunityforcoders'
    solution = Solution()
    output = solution.removeVowels(input)
    print("Output: ", output)


class Solution(object):
    def removeVowels(self, input):
        print("Remove Vowels")

        # Step1 - Create output variable
        output = ''

        # Step2 - Traverse through input array
        for letter in input:

            # Step3 - Check if letter is vowel. Continue to next if true
            if (letter == 'a' or letter == 'e' or letter == 'i' or letter == 'o' or letter == 'u'):
                continue

            # Add letter to output char
            output += letter
        return output





if __name__ == '__main__':
    main()