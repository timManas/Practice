import NestedInteger from NestedInteger.py      # This import is NOT required since the class itself is undefined



class Solution(object):
    def depthSum(self, nestedList):

        level = 1
        total = self.traverseList(nestedList, level)

        return total

    def traverseList(self, nestedList, level):
        total = 0

        for element in nestedList:

            if element.isInteger():
                total += element.getInteger() * level
                continue

            total += self.traverseList(element.getList(), level + 1)

        return total


def main():
    solution = Solution()

    nestedList = [[1,1],2,[1,1]]
    output = solution.depthSum(nestedList)
    print ("Weight Sum: ", output, "\n")

    nestedList = [1,[4,[6]]]
    output = solution.depthSum(nestedList)
    print ("Weight Sum: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Abit tricky but not too much. Had to solve in java first
- Uses recursion to traverse down the list

Solution
1. Traverse the list
2. If element is integer, add to total
3. If list, then we use recursion to find the total of its element
4. Continue until all elements have been iterated


'''