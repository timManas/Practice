class Solution(object):
    def uniqueOccurrences(self, arr):

        # Step1 - Create Dict to keep track of all occurences
        dict = {}

        # Step2 - Create set to keep track of unique occurences
        valueSet = set()

        # Step3 - Traverse input arr and populate Dict
        for num in arr:
            key = num
            value = 1
            if num in dict:
                value = dict.get(key) + 1

            dict[key] = value

        # Step4 - Check if values are unique
        for value in dict.values():
            if value in valueSet:
                return False

            valueSet.add(value)

        return True


def main():
    arr = [1,2,2,1,1,3]
    # arr = [1, 2]
    solution = Solution()
    output = solution.uniqueOccurrences(arr)
    print("Unique Num Occurence: ", output)


if __name__ == '__main__':
    main()



'''
Notes
- Super Easy


Solution
1. Create a dictionary and Set
2. Traverse through input array and populate dict
3. Take all the values in dict and populate set
4. If we have duplicate, return false ...Simple 

'''