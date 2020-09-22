
class Solution(object):
    def average(self, salary):

        # Step1 - Sort the input array
        salary.sort()

        # Step2 - Fetch the subList from 1 to len - 1
        exclMinMaxList = salary[1: salary.__len__() -1]
        print("ExclMinMaxList: ", exclMinMaxList)

        # Step3 - Find the avg
        total = 0
        for num in exclMinMaxList:
            total += num
        total = float(total / exclMinMaxList.__len__())

        return total


def main():
    salary = [48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000]
    solution = Solution()
    output = solution.average(salary)
    print("Avg: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Simple 

Solution
1. Sort input array
2. Fetch sublist from 1 to len - 1
3. Find the avg from the sublist

'''