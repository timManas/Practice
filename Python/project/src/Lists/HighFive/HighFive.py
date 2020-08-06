class Solution:
    def highFive(self, items):

        # Step0 - Create output variable to return
        output = []
        studentGradeMap = {}     # This map is to store a list of each students grades

        # Step1 - Traverse through List and append values to the map
        for subArray in items:
            key = subArray[0]
            value = subArray[1]

            if key in studentGradeMap:
                studentGradeMap.get(key).append(value)
            else:
                studentGradeMap[key] = [value]

        print("studentGradeMap: ", studentGradeMap)

        # Step2 - Sort mapValues
        for key, value in studentGradeMap.items():
            studentGradeMap.get(key).sort()
            studentGradeMap.get(key).reverse()
            print("Key: ", key, "   Value: ", value)

            # Step3 - Calculate the Average for each key
            average = 0
            for i in range(5):
                average += studentGradeMap.get(key)[i]
            average = average / 5

            # Step4 - Create studentGradeMap
            output.append([int(key), int(average)])

        return output

def main():
    items = [[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
    solution = Solution()
    output = solution.highFive(items)
    print("Highest Value for each Student: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Slightly Tricky but not too bad


Solution
1. Use a map to store list of all students grades
2. Traverse the nested list
3. For each entry, find the studentID in the map and append the grade to the respective student list
4. Sort the list within the map
5. Find the Top 5
4. Calculate the student average of the top 5 grades
7. Append the student id and the average to the studentGradeMap

'''