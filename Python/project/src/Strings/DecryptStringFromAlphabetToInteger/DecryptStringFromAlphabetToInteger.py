

class Solution(object):
    def freqAlphabets(self, input):

        # Step1 - Create output variable
        output = ""

        # Step2 - Set Mapping
        map = self.setMapping()

        # Step3 - Traverse List using while Loop
        i = input.__len__() - 1
        while i >= 0:

            # Step4 - Find current Letter
            letter = input[i]
            print("\nLetter: " + letter)


            # Step5 - Check if letter is #
            # Find the next two letters
            if letter == "#":
                i -= 1
                secondLetter = input[i]     # Find second Letter

                i -= 1
                firstLetter = input[i]      # Find first letter

                # Step6 - Combine letters together
                letter = firstLetter + secondLetter + "#"
                print("CombinedLetter: " + letter)

            # Step7 - Increment to next index
            i -= 1

            # Step8 - Convert to String & Append
            output += map.get(letter)
            print("Output: " + output)

        # Step9 - Reverse String
        output = output[::-1]
        print("Reversed: " + output)

        return output

    def setMapping(self):
        map = {}
        map['1'] = 'a'
        map['2'] = 'b'
        map['3'] = 'c'
        map['4'] = 'd'
        map['5'] = 'e'
        map['6'] = 'f'
        map['7'] = 'g'
        map['8'] = 'h'
        map['9'] = 'i'
        map['10#'] = 'j'
        map['11#'] = 'k'
        map['12#'] = 'l'
        map['13#'] = 'm'
        map['14#'] = 'n'
        map['15#'] = 'o'
        map['16#'] = 'p'
        map['17#'] = 'q'
        map['18#'] = 'r'
        map['19#'] = 's'
        map['20#'] = 't'
        map['21#'] = 'u'
        map['22#'] = 'v'
        map['23#'] = 'w'
        map['24#'] = 'x'
        map['25#'] = 'y'
        map['26#'] = 'z'

        return map


def main():
    # inputList = ["10#11#12", "1326#", "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"]
    inputList = ["10#11#12"]
    solution = Solution()

    for input in inputList:
        output = solution.freqAlphabets(input)
        print("Decrypted: " + output)


if __name__ == '__main__':
    main()


'''
Notes
- Definitely not Easy

Solution
1. Create numeric to alphbetic mapping
2. Traverse the array starting from the end
3. If we encounter a # ...find the next two values
4. Convert number to alphabet using map
5. Reverse the string since we started from the end till we reach the beginning


'''