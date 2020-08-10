class Solution(object):
    def busyStudent(self, startTime, endTime, queryTime):
        output = 0

        for i in range(startTime.__len__()):
            studentStartTime = startTime[i]
            studentEndTime = endTime[i]

            if studentStartTime <= queryTime and studentEndTime >= queryTime:
                output += 1

        return output


def main():
    # startTime = [1, 2, 3]
    # endTime = [3, 2, 7]
    # queryTime = 4

    startTime = [9, 8, 7, 6, 5, 4, 3, 2, 1]
    endTime = [10, 10, 10, 10, 10, 10, 10, 10, 10]
    queryTime = 5

    solution = Solution()
    output = solution.busyStudent(startTime, endTime, queryTime)
    print("Number of Students Homwork: " + str(output))

if __name__ == '__main__':
    main()


'''
Notes
- Way too easy

Solution
1. Traverse both arrays
2. Check if  StartTime < QueryTime < EndTime

'''