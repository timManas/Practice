class Solution(object):
    def groupAnagrams(self, input):
        output = []
        wordDic = {}

        for word in input:
            print("Current word: " + word)
            charTotal = 0
            for char in word:
                charNum = ord(char)
                charTotal += charNum
                print(char, "   num: ", charNum)

            print("charTotal: ", charTotal)

            if charTotal in wordDic:
                wordList = wordDic[charTotal]
                wordList.append(word)
            else:
                wordDic[charTotal] = [word]

            print()

        return wordDic.values()


def main():
    # strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    strs = ["cab","tin","pew","duh","may","ill","buy","bar","max","doc"]
    solution = Solution()
    output = solution.groupAnagrams(strs)
    print("Group Anagrams: ", output)


if __name__ == '__main__':
    main()