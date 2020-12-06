class Solution(object):
    def groupAnagrams(self, input):
        wordDic = {}

        # Step1 - Traverse input array one by one
        for word in input:

            # Step2 - Sort the current word alphabetically
            sortedWord = ''.join(sorted(word))
            print("Current Word: ", word, " Sorted: ", sortedWord )

            # Step3 - If sorted Word already exists, add to dictionary. If not, create new list
            if sortedWord in wordDic:
                wordList = wordDic[sortedWord]
                wordList.append(word)
            else:
                wordDic[sortedWord] = [word]

        return wordDic.values()


def main():
    # strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    strs = ["cab","tin","pew","duh","may","ill","buy","bar","max","doc"]
    solution = Solution()
    output = solution.groupAnagrams(strs)
    print("Group Anagrams: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Alot easier than i thought it would be 


Solution
1. Traverse the list one by one
2. For each word, sort the word.
3. Check if word exists in dictionary:
    > Exists, add onto existing value list
    > !Exists, create new list with current word
4. Return list of values


'''