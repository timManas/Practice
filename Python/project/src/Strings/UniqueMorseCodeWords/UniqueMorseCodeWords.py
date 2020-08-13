class Solution(object):
    def uniqueMorseRepresentations(self, words):

        # Output variable
        count = 0

        map = {}

        morseCode = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        for i in range(morseCode.__len__()):
            letter = chr(97 + i)
            code = morseCode[i]
            map.update({letter: code})
        print("Map: ", map)

        return count

def main():
    words = ["gin", "zen", "gig", "msg"]
    solution = Solution()
    output = solution.uniqueMorseRepresentations(words)
    print("Number of Unique Transformation: " + str(output))


if __name__ == '__main__':
    main()