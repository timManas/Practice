class Solution(object):
    def uniqueMorseRepresentations(self, words):

        # Step1 - Output variable
        count = 0
        morseSet = set({})

        # Step2 - Creaet morse code:letter mapping
        map = {}
        morseCode = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        for i in range(morseCode.__len__()):
            letter = chr(97 + i)
            code = morseCode[i]
            map.update({letter: code})
        print("Map: ", map)

        # Step3 - Traverse each word in word array
        for word in words:
            morseConverted = ""

            # Step4 - Find the morse For each letter
            for letter in word:
                morse = map.get(letter)
                morseConverted += morse

            # Step5 - Add the morseConverted to the set
            print("MorseConverted: " + morseConverted)
            morseSet.add(morseConverted)

        # Steo6 - Find the length of the set
        count = morseSet.__len__()

        return count

def main():
    words = ["gin", "zen", "gig", "msg"]
    solution = Solution()
    output = solution.uniqueMorseRepresentations(words)
    print("Number of Unique Transformation: " + str(output))


if __name__ == '__main__':
    main()


'''
Notes
- Not too bad ... just a pain the ass


Solution
1. Create the morse:letter mapping
2. Traverse the words array
3. For each word, traverse each letter in the word
    - Find the morse translation for each letter
    - Append the morse code 
    - Add the morse code to the set
4. Return the size of the set

'''