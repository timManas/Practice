from ast import List


def main():
    solution = Solution()
    nums1 = [2, 3, 2]
    nums2 = [1, 2]
    print("FindIntersection: ", solution.findIntersectionValues(nums1, nums2), "\n")

    nums1 = [4, 3, 2, 3, 1]
    nums2 = [2, 2, 5, 2, 3, 6]
    print("FindIntersection: ", solution.findIntersectionValues(nums1, nums2), "\n")

    nums1 = [3, 4, 2, 3]
    nums2 = [1, 5]
    print("FindIntersection: ", solution.findIntersectionValues(nums1, nums2), "\n")
    return


class Solution:
    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        print("nums1: ", nums1)
        print("nums2: ", nums2)

        answer1 = 0
        answer2 = 0

        set1 = set(nums1)
        set2 = set(nums2)

        for val in nums1:
            if (val in set2):
                answer1 += 1

        for val in nums2:
            if (val in set1):
                answer2 += 1


        return [answer1, answer2]

if __name__ == "__main__":
    main()