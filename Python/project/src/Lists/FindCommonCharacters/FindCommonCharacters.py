class Solution(object):
    def commonChars(self, inputArr):

        # Step1 - Set the output Variable
        output = []
        commonCharDict = {}             # This is the main Dictionary to keep track of all common letters


        # Step2 - Traverse all words in input Arrat
        for word in inputArr:
            print("CurrentWord: " + word)

            # Step3 - Create Dictionary for current word
            currentDic = {}
            for letter in word:

                if letter in currentDic:
                    currentDic[letter] = currentDic[letter] + 1
                else:
                    currentDic[letter] = 1

            # If first letter, then initialize the commonCharDict
            if commonCharDict.__len__() == 0:
                commonCharDict = currentDic
                continue

            # Step4 - Compare Current Word Dictionary & the CommonCharDictionary
            # Create newDict by taking the smallst Value between CurrentWordDict and CommonCharDict
            newDict = {}
            for key,value in commonCharDict.items():

                # If not in dictionary, CONTINUE to the next one
                if key not in currentDic:
                    continue

                # Fetch the smallest value between both dictionary
                if currentDic[key] < commonCharDict[key]:
                    newDict[key] = currentDic[key]
                else:
                    newDict[key] = commonCharDict[key]

            # Step5 - Set the commonCharDict
            commonCharDict = newDict

            # Step6 - Check if the commonCharDict has common Elements.
            # If size == 0, means we have no intersection and return early
            if commonCharDict.__len__() == 0:
                return {}


            print("Common Word Dic: ", commonCharDict)


        # Step7 - Put all the words from dicitonary into outputList
        for key, value in commonCharDict.items():
            counter = value
            while (counter > 0):
                output.append(key)
                counter -= 1


        return output

def main():
    # A = ["bella","label","roller"]
    A = ["acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"]
    solution = Solution()
    output = solution.commonChars(A)
    print("Common Characters: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Slighly tricky but made it work
- Actually improved the runtime compared to Java


Solution
1. Create a commonDictionary to store all intersecting letters
2. Traverse the input array
    - Find the current  Word Dictionary
    - Compare with commonDictinary  and assign all intersecting key into newDictionary
    - Reset commonDictionary  to the newDictionary
3. Place all letters from Dictionary into outputList TIMES by 'value' 


'''