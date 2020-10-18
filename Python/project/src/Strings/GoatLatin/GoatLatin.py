class Solution(object):
    def toGoatLatin(self, input):

        # Step1 - Create output variable
        goatLatin = ""

        # Step2 - Split input string into list Array
        wordList = input.split(" ")
        print("Words: ", wordList)

        # Step3 - Create aIndex to store number of 'a's
        aIndex = 'a'

        # Step4 - Traverse the list of words
        for i in range(wordList.__len__()):
            word = wordList[i]
            print("Current Word: ", word)

            # Step5 - If vowels just add 'ma'
            if (word[0] == 'a' or word[0] == 'A' or
                word[0] == 'e' or word[0] == 'E' or
                word[0] == 'i' or word[0] == 'I' or
                word[0] == 'o' or word[0] == 'O' or
                word[0] == 'u' or word[0] == 'U'):
                print("Vowel Found")

            else:           # If Constants ...place first letter into end of word
                firstLetter = word[0]
                word = word[1:] + firstLetter

            # Step5 - Add 'ma'
            word = word + 'ma'

            # Step6 - Add i index
            if i > 0:
                aIndex += 'a'

            # Step7 - Append to goatLatin
            word += aIndex
            print(word)
            goatLatin = " ".join([goatLatin, word])


        return goatLatin.lstrip()

def main():
    S = "I speak Goat Latin"
    S = "The quick brown fox jumped over the lazy dog"
    S = "Each word consists of lowercase and uppercase letters only"
    solution = Solution()
    output = solution.toGoatLatin(S)
    print("Goat Latin: " + output)


if __name__ == '__main__':
    main()


'''
Notes
- A bit confusing but not hard

Solution
1. Split input string into array
2. Traverse each word
3. For each word, if first letter is vowel: just add 'ma'
    - If first letter is constant: move first letter + add 'ma'
4. Add additional 'a' for each letter

'''