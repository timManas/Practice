class Solution(object):
    def largestUniqueNumber(self, inputArr):

        # Step1 - Create two sets to stire all the elements in the input Arr and to store the repeated numbers
        uniqueSet = set()
        repeatedSet = set()

        # Step2 - Populate Set
        for number in inputArr:
            if number in uniqueSet:
                repeatedSet.add(number)

            uniqueSet.add(number)

        # Step3 - Find the Difference between the two Sets
        differenceSet = uniqueSet.difference(repeatedSet)

        if differenceSet.__len__() == 0:
            return -1

        print("Difference: ", differenceSet)

        # Step4 - Convert to List and Sort
        listDifference = list(differenceSet)
        listDifference.sort()

        # Step5 - Return the largest Element in the Set
        return listDifference.pop()



def main():
    A = [5,7,3,9,4,9,8,3,1]
    solution = Solution()
    output = solution.largestUniqueNumber(A)
    print("Largest Unique Number: ", output)

if __name__ == '__main__':
    main()


'''
Notes
- Pretty simple
- Was thinking of using a map to store occurences and sort by value. 
 > This approach was complicated and this one is alot simpler
 
Solution
1. Create two sets:
    > One to store all elements in inputArr
    > Second to store all repeated numbers in inputArr
2. Find the difference between the two sets
3. Change type of differenceSet to List and Sort
4. Return the last element in list =) 


'''