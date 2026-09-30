from ast import List


def main():

    solution = Solution()
    input = [[1,2,3,4], [0,2,2], [6,6,6], [1,3,5]]
    for arr in input:
        print("unique num: ", str(solution.totalNumbers(arr)), "\n")
    return


class Solution:
    def totalNumbers(self, digits: List[int]) -> int:

        numCombSet = set()
        for i,first in enumerate(digits):
            for j,second in enumerate(digits):
                for k,third in enumerate(digits):

                    if (i == j or i==k or j==k):
                        continue

                    combination = int(str(first) + str(second) + str(third))


                    if (combination < 100):
                        continue

                    if (combination % 2 != 0 ):
                        continue

                    if (combination in numCombSet):
                        continue
                    numCombSet.add(combination)

                    print("combination: ", combination)
        return len(numCombSet)

if __name__ == "__main__":
    main()