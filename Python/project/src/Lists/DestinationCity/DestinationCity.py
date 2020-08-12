class Solution(object):
    def destCity(self, paths):

        # Step0 - Create Output variable
        startCity = ""
        endCity = ""
        map = {}        # Store the start:end

        # Step1 - Populate Map
        for pathStartEnd in paths:
            start = pathStartEnd[0]
            dest = pathStartEnd[1]
            map.update({start:dest})

            if startCity == "":
                startCity = start


        # Step2 - Continue traversing Map until we reach the end
        # Note: The endCity will NOT be startCity =)
        while startCity in map:
            endCity = map.get(startCity)
            startCity = endCity

        return endCity


def main():
    # paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
    # paths = [["B","C"],["D","B"],["C","A"]]
    paths = [["qMTSlfgZlC","ePvzZaqLXj"],["xKhZXfuBeC","TtnllZpKKg"],["ePvzZaqLXj","sxrvXFcqgG"],["sxrvXFcqgG","xKhZXfuBeC"],["TtnllZpKKg","OAxMijOZgW"]]
    solution = Solution()
    output = solution.destCity(paths)
    print("Destination City: " + output)


if __name__ == '__main__':
    main()

'''
Notes
- Takes a bit of thinking

Solution
1. Create map to store different start/end destinations
2. Start from StartCity and traverse the map
3. If the startCity is NOT part of the key of map, then this is the final destination

'''