class Solution(object):
    def isPrefixOfWord(self, sentence, searchWord):

        # Step1 - Split Sentence into words and store into array
        wordArr = sentence.split(" ")

        # Step2 - Traverse the list
        for i in range(wordArr.__len__()):
            currentWord = wordArr[i]
            print("Word: " + currentWord)

            # Step3 - Check if search word in current Word AND searchWord == prefix
            if searchWord in currentWord:
                prefix = currentWord[0: searchWord.__len__()]
                print("Prefix:", prefix)
                if searchWord == prefix:
                    return i + 1

        return -1


def main():
    sentence = "hellohello hellohellohello"
    searchWord = "ell"

    # sentence = "i love eating burger"
    # searchWord = "burg"
    solution = Solution()
    output = solution.isPrefixOfWord(sentence, searchWord)
    print("Minimum index of prefix word: ", output)


if __name__ == '__main__':
    main()


'''
Note
- Easy 

Solution
1. Split sentence into words
2. Traverse the list one by one
3. Check if searchWord is in word AND searchword is prefix 
    > Return the index + 1
4. Return -1 if nothing found

'''