package Lists.NestedListWeightSum;

import java.util.List;

public class NestedListWeightSum {

    public static void main(String [] args) {

    }

    public static int depthSum(List<NestedInteger> nestedList) {
        int level = 1;
        int total = traverseList(nestedList, level);

        return total;
    }

    private static int traverseList(List<NestedInteger> nestedList, int level) {

        int total = 0;
        for (NestedInteger element : nestedList){

            // Check if Integer
            if (element.isInteger()) {
                total += element.getInteger() * level;
                System.out.println("Integer Encountered: " + element.getInteger() + "       Total: " + total + "    Level: " + level);
                continue;
            }

            // If List
            total += traverseList(element.getList(), level + 1);
            System.out.println("List Encountered: " + element.getList() + "       Total: " + total + "    Level: " + level);
        }

        return total;
    }
}


/**
 Notes
 - A bit tricky but not tooo much
 - Uses recursion to traverse the inner Trees

 Solution
 1. Traverse the List
 2. Check if object is integer or list
 3. If list, use recursion to find the total
    > If integer, Add to the total
 4. Continue until all elements are traversed



 */