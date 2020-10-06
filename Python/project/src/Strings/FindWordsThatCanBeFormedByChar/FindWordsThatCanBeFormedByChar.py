class Solution(object):
    def countCharacters(self, words, chars):

        # Step0 - Create output variable
        count = 0

        # Step1 - Create Map for chars
        charsDic = self.getMap(chars)

        # Step2 - Traverse words Array and compare Map
        for word in words:
            print("Current Word: ", word)
            wordDic = self.getMap(word)

            # Step3 - Compare the two dictionaries
            # Add if and only if currentWord Map is smaller or equal to charsDic
            if self.checkWordCanBeFormed(charsDic, wordDic):
                count += word.__len__()

        # Step4 - Return count
        return count

    def getMap(self, dictionary):
        map = {}
        for letter in dictionary:
            value = 1
            if letter in map:
                value = map[letter] + 1
            map[letter] = value

        return map

    def checkWordCanBeFormed(self, refDic, wordDic):

        for key,value in wordDic.items():

            if key not in refDic:
                return False

            # Here Key is present in charsDic - Now Check if value is equal than or less than charsDic
            if value > refDic[key]:
                return False

        return True


def main():
    words = ["cat", "bt", "hat", "tree"]
    chars = "atach"
    solution = Solution()
    output = solution.countCharacters(words, chars)
    print ("Count: ", output)

if __name__ == '__main__':
    main()


'''
Notes
- Not difficult

Solution 
1. Create a map for the charsArray. This will be the reference Map we compare each word 
2. Traverse through word array:
- Create dictonary of current word
- Compare the current word dictionary to the referenceDictionary
3. If word can be formed, we inrement count to the length of the word
4. Return count


'''