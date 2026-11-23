from ast import List


def main():
    solution = Solution()
    mat = [[0, 1], [1, 0]]
    print("Row With Max Ones: ", solution.rowAndMaximumOnes(mat), "\n")

    mat = [[0, 0, 0], [0, 1, 1]]
    print("Row With Max Ones: ", solution.rowAndMaximumOnes(mat), "\n")

    mat = [[0, 0], [1, 1], [0, 0]]
    print("Row With Max Ones: ", solution.rowAndMaximumOnes(mat), "\n")

    return




class Solution:
    def findMaxOnes(self, list: List[int]) -> int:
        count = 0

        for num in list:
            if num == 1:
                count += 1

        return count


    def rowAndMaximumOnes(self, mat: List[List[int]]) -> List[int]:
        print("list: ", mat)
        output = []

        smallestRow = 0
        maxOnes = 0

        for i,list in enumerate(mat):
            print("i: ", i, "       list: ", list)

            numOnes = self.findMaxOnes(list)
            if maxOnes < numOnes:
                smallestRow = i
                maxOnes = numOnes

        output = [smallestRow, maxOnes]

        return output



if __name__ == "__main__":
    main()