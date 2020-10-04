class Solution(object):
    def numSpecialEquivGroups(self, input):

        # Step1 - Create a Set to store all unique elements
        unqiueWords = set()

        # Step2 - Traverse the input array
        for word in input:
            print("Current Word: " + word)

            # Step3 - Create two list to store odd and even letters
            evenList = []
            oddList = []

            # Step4 - Traverse each letter and populate the evenList and oddList
            for i in range(word.__len__()):
                letter = word[i]
                if i % 2 == 0:
                    evenList.append(letter)
                else:
                    oddList.append(letter)

            # Step5 - Sort the list
            evenList.sort()
            oddList.sort()

            # Step6 - Combine the two list together and convert to String word
            evenList.extend(oddList)
            soretdWord = "".join(evenList)
            print("SortedWord: ", soretdWord)


            # Step7 - Add sortedWord to Set
            unqiueWords.add(soretdWord)


        # Step8 - Return size of set
        return unqiueWords.__len__()


def main():
    A = ["abcd","cdab","cbad", "xyzz","zzxy","zzyx"]
    solution = Solution()
    output = solution.numSpecialEquivGroups(A)
    print("Groups of Special Equivalent Strings: ", output)


if __name__ == '__main__':
    main()

'''
Notes
- Tricky but implementation is easy

Solution
1. You will need:  
- Set
- List which contains even #
- List which contains odd #

2. Populate the odd and even List
3. Sort the list 
4. Combine the list together and convert to String
5. Add sortedWord to Set
6. Return the set size


Why does this work ? 
- Because we dont care about the position of the word in their respective set
- When we SORT the lists (odd and even), we make sure we get the UNIQUE combination of word


Just try it out =)

'''