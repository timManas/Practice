class Solution(object):
    def arraysIntersection(self, arr1, arr2, arr3):

        # Step1 - Convert list to sets
        set1 = set(arr1)
        set2 = set(arr2)
        set3 = set(arr3)

        # Step2 - Find the intersection of the sets
        set1 = set1.intersection(set2)
        set1 = set1.intersection(set3)

        # Step3 - Convert set back to list and sort
        output = list(set1)
        output.sort()
        return output

def main():
    arr1 = [1, 2, 3, 4, 5]
    arr2 = [1, 2, 5, 7, 9]
    arr3 = [1, 3, 4, 5, 8]
    solution = Solution()
    output = solution.arraysIntersection(arr1, arr2, arr3)
    print("Intersection of Arrays: " , output)


if __name__ == '__main__':
    main()

'''
Notes
- Super Easy

Solution
1. Convert arrays to sets
2. Find the intersection using intersection()
3. Convert main set back to list and return
'''