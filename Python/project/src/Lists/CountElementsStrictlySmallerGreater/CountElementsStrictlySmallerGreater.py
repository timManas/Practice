def main():
    input = [[11, 7, 2, 15],  [-3, 3, 3, 90], [-71,-71,93,-71,40]]
    solution = Solution()

    for i in range(input.__len__()):
        print("Count elements strictly smaller greater: " + str(solution.countElements(input[i])) + "\n")

class Solution(object):
    def countElements(self, nums):
        nums.sort()
        count = 0



        #Start from 1 to length - 1;
        for i in range(1, nums.__len__()-1):

            isFirst = False
            isLast = False

            current = nums[i]
            prev = nums[i-1]
            next = nums[i+1]
            print("prev: " + str(prev) + " current: " + str(current) + " next: " + str(next))

            j = i
            while (prev == current):
                if (j <= 0):
                    isFirst = True
                    break
                prev = nums[j-1]
                j -= 1
            if (isFirst):
                continue


            j = i
            while (next == current):
                if (j >= nums.__len__() - 1):
                    isLast = True
                    break

                next = nums[j+1]
                j += 1
            if (isLast):
                continue

            count +=  1

        print("count: " + str(count))
        return count



if __name__ == '__main__':
    main()
