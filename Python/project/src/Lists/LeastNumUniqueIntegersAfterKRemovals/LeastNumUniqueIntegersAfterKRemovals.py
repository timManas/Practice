class Solution(object):
    def findLeastNumOfUniqueInts(self, arr, numLettersToRemove):

        # Step1 - Create Dictionary to store all the num of occurence of each number
        dictionary = {}

        # Step2 - Populate the dictionary
        for num in arr:
            if num in dictionary:
                dictionary[num] = dictionary[num] + 1
            else:
                dictionary[num] = 1

        # Step3 - Sort Dictionary by Value
        dictionary = {key:value for key,value in sorted(dictionary.items(), key=lambda item: item[1])}
        print("Sorted: ", dictionary)

        # Step4
        # Old Solution but Slow ...Time Limit Exceeded
        # while numLettersToRemove > 0:
        #     firstKey = list(dictionary)[0]
        #     if dictionary[firstKey] == 1:
        #         dictionary.pop(firstKey)
        #     else:
        #         dictionary[firstKey] = dictionary[firstKey] - 1
        #
        #     numLettersToRemove -= 1


        # Step 4 - Starting k to 0, traverse the valueList and update Pointers
        # For each value, we decrement by one. If value reaches zero we move to the next KeyPointer
        # Solution does not involve removing elements from the dictionary but instead uses
        # two list and two pointers to keep track of the position
        keyList = list(dictionary.keys())           # List of all keys
        valueList = list(dictionary.values())       # List of all Values
        keyPointer = 0                              # Keep track of the current key position
        valuePointer = 0                            # Keep track of the current value position

        while numLettersToRemove > 0:
            if (valueList[valuePointer] > 0):
                valueList[valuePointer] = valueList[valuePointer] - 1

            if valueList[valuePointer] == 0:
                keyPointer += 1
                valuePointer += 1

            print("Key Pointer: ", keyPointer)
            numLettersToRemove -= 1



        # Step5 - Find the SubList from keyPointer to end and return its length
        output = keyList[keyPointer:].__len__()

        return output

def main():
    arr = [4, 3, 1, 1, 3, 3, 2]
    k = 3
    # arr = [5, 5, 4]
    # k = 1
    solution = Solution()
    output = solution.findLeastNumOfUniqueInts(arr, k)
    print("Least Num Unique Integers: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Actually not too bad for a Medium
- Stuck at 40/43

Solution
1. Populate the dictionary with num of occurences
2. Sort Dictionary by Value


'''