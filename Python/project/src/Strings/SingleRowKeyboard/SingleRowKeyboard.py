def main():
    # keyboard = "abcdefghijklmnopqrstuvwxyz"
    # word = "cba"

    keyboard = "pqrstuvwxyzabcdefghijklmno"
    word = "leetcode"

    solution = Solution()
    output = solution.calculateTime(keyboard, word)
    print("Time: " + str(output))

class Solution(object):
    def calculateTime(self, keyboard, word):
        print("Keyboard: " + keyboard + "     word: " + word)

        # Step1 - Create output variable
        output = 0

        # Step2 - Track the prev variable
        prevIndex = 0

        # Step3 - Traverse each letter in word
        for letter in word:

            # Step4 - Find the index of the letter
            index = keyboard.find(letter)

            # Step5 - Calculate the difference and add to the output
            output += abs(prevIndex - index)

            # Step6 - Set the prev index
            prevIndex = index

        return output

if __name__ == '__main__':
    main()


'''
Notes
- Easy
- We use an absolute value to make sure diff is always positive


Solution
- Traverse each letter in word
- Find the index of the current word
- Calculate the difference between the prevWord and current Word  & Add difference to output variable
- Set the prevIndex to the current one
- Repeat until all words are covered

'''