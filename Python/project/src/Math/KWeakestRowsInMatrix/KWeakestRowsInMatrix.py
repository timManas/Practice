import operator

class Solution(object):
    def kWeakestRows(self, mat, k):
        output = []
        rowDict = {}


        # Ste1 - Populate the Dic
        for i in range(len(mat)):
            row = mat[i]
            numOf1InRow = row.count(1)
            rowDict[i] = numOf1InRow
            print("Row: ", row, "   Num1sInRow: ", numOf1InRow)

        # Step3 - Sort from Weakest to Strongest
        print("Dict: ", rowDict)
        sorted_dic = sorted(rowDict.items(), key=operator.itemgetter(1))    # You need to have 'key=' here
        print("SortedDict: ", sorted_dic)


        # Step4 - Fetch the k element
        counter = 0
        for key,val in sorted_dic:
            if counter >= k:
                break

            output.append(key)
            counter += 1

        return output


def main():
    mat = [[1, 1, 0, 0, 0],
     [1, 1, 1, 1, 0],
     [1, 0, 0, 0, 0],
     [1, 1, 0, 0, 0],
     [1, 1, 1, 1, 1]]           # Do not put a , here, otherwise this list will become a TUPLE
    k = 3
    solution = Solution()
    output = solution.kWeakestRows(mat, k)
    print("Weakest Rows: ", output)

if __name__ == '__main__':
    main()


'''
Notes
- Problem itself wasnt the hardest
- Hardest part was trying to sort the dictionry by value

Solution
1. Populate dictionary with key = row and Row = # occurences of 1
2. Sort the dictionary by value 
3. Return the first k rows

'''