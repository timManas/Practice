
class Solution(object):
    def repeatedNTimes(self, array):

        # Step1 - Find N
        N = array.__len__() / 2

        # Step2 - Populate map
        mapElement = {}
        for number in array:

            value = 1
            if number in mapElement:
                value = mapElement.get(number) + 1

            mapElement[number] = value

        # Step3 - Find key which is equal to N
        for key, value in mapElement.items():
            print("Key: ", key, "   Value: ", value)
            if value == N:
                return key



def main():
    A = [[1,2,3,3], [2,1,2,5,3,2], [5,1,5,2,5,3,5,4]]
    solution = Solution()

    for arr in A:
        output = solution.repeatedNTimes(arr)
        print("N-Repeated Element: ", output, "\n")


if __name__ == '__main__':
    main()

'''
Notes
- Easy

Solution
1. Find N
2. Create map and populate map by traversing list
3. Find the key which equals to N


'''