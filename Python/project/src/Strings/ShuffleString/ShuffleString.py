def main():
    s = "codeleet"
    indices = [4, 5, 6, 7, 0, 2, 1, 3]
    solution = Solution()
    output = solution.restoreString(s, indices)
    print("RestoredString: " + output)

class Solution(object):
    def restoreString(self, s, indices):

        # Step1 - Create output variable
        output = ""

        # Step2 - Create Map to store the index with the values
        wordMap = {}
        index = 0

        # Step3 - Traverse the indices and Create the Map
        for i in (indices):
            wordMap[i] = s[index]
            index += 1
        print("Map: ", wordMap)

        # Step4 - Sort the keys and add them to outputList
        for i in sorted(wordMap.keys()):
            output += wordMap[i]

        return output


if __name__ == '__main__':
    main()

'''
Notes
- Simple

Solution
1. Create a Map with the key/value of the indices and the character
2. Sort the map based off keys
3. Traverse the sorted map and append to output variable
4. Return output variable

'''