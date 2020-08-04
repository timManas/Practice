class Solution(object):
    def anagramMappings(self, A, B):
        output = []

        for num in A:
            indexB = B.index(num)
            output.append(indexB)

        return output

def main():
    A = [12, 28, 46, 32, 50]
    B = [50, 12, 32, 46, 28]

    solution = Solution()
    output = solution.anagramMappings(A,B)
    print("Output: ", output)



if __name__ == '__main__':
    main()


'''
Notes
- Super easy

Solution
1. Traverse through list A
2. Fetch the index of currentNum in A in list B
3. Append index to the output list 
4. Return output List

'''