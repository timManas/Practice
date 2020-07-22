def main():
    n = 4421
    solution = Solution()
    output = solution.subtractProductAndSum(n)
    print("Result: ", output)



class Solution(object):
    def subtractProductAndSum(self, n):
        sum = -1
        product = -1

        # Step1: Convert n to String and Traverse inidiviual element
        for x in str(n):

            num = int(x)

            # Step2: Fetch Sum
            if sum == -1:
                sum = num
            else:
                sum += num

            # Step3: Fetch product
            if product == -1:
                product = num
            else:
                product *= num

        # Step4: Calculate the difference
        result = product - sum

        return result



if __name__ == '__main__':
    main()

'''
Solution
1. Convert the list into String to fetch inidivual letters
2. Fetch the Sum and product by traversing each letter and concatenating each number
3. Calculate the difference 

'''