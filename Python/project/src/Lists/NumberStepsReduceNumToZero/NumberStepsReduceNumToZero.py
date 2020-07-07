def main():
    num = 123
    solution = Solution()
    output = solution.numberOfSteps(num)
    print("Number of Steps: ", output)

class Solution(object):
    def numberOfSteps(self, num):

        # Step1 - Create return counter variable
        counter = 0
        print("Starting Num Steps")

        # Step2 - Keep calculating until we get 0
        while num > 0:
            if (num % 2 == 0):   # Even - Dividie by 2
                num = num / 2
            else:                # Odd - Subtract 1
                num -= 1

            # Step3 - Increment counter
            counter += 1



        return counter


if __name__ == '__main__':
    main()

'''
Solution
- Very Simple
- NOthing to it. If odd, subtract 1. If even, divide by 2
- Continue do it until num is zero

'''