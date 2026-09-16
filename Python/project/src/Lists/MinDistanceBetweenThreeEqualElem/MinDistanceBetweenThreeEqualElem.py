def main():
    input = [[1, 2, 1, 1, 3], [1,1,2,3,2,1,2], [1]]

    solution = Solution()
    for x in input:
        print("minDistance: ", solution.minimumDistance(x),"\n")



class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        print("list: ", nums)

        minDistance = 123456789

        map: dict[int, list[int]] = {}

        for i in range(len(nums)):
            current = nums[i]

            list = []
            if current in map:
                list = map[current]
            list.append(i)
            map[current] = list

        print("map: ", map)

        for key, value in map.items():
            if len(value) < 3:
                continue


            for index in range(len(value)-2):
                i = value[index]
                j = value[index+1]
                k = value[index+2]
                print(i, j, k)

                distance = abs(i - j) + abs(j - k) + abs(k - i)
                minDistance = min(minDistance, distance)


        return -1 if minDistance == 123456789 else minDistance

if __name__ == "__main__":
    main()