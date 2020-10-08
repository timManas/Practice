class Solution(object):
    def fib(self, N):

        # Step1 - Set default N values
        if N == 0:
            return 0
        if N == 1:
            return 1

        # Steo2 - Return fib(N-1) + fib(N-2)
        return (self.fib(N-1) + self.fib(N-2))

def main():
    N = 3
    solution = Solution()
    output = solution.fib(N)
    print("Fibonacci: ", output)


if __name__ == '__main__':
    main()


'''
Notes
- Super Easy

Solution
1. Use recursion to traverse to N=0 and N=1


'''