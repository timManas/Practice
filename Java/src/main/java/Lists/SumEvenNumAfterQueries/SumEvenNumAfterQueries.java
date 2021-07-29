package Lists.SumEvenNumAfterQueries;

import java.util.Set;
import java.util.TreeSet;

public class SumEvenNumAfterQueries {
    public static void main(String [] args) {
       int [] nums = {1,2,3,4};
       int [][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
       int [] output = sumEvenAfterQueries(nums, queries);
       System.out.println();
       for (int i : output) {
           System.out.print(i + ",");
       }
    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int [] output = new int[queries.length];

        // Step1 - Create Set of Integers which are even
        Set<Integer> indexSet = new TreeSet<>();

        // Step2 - Create variable which stores the Sum of all even digits
        int total = 0;

        // Step3 - Initialize the set and total
        for (int x=0; x<nums.length; x++) {
            if (nums[x] % 2 == 0) {
                indexSet.add(x);
                total += nums[x];
            }
        }
        System.out.println("total: " + total + "  Set: " + indexSet);

        // Step4 - Traverse the queries array
        for (int i=0; i < queries.length; i++) {
            int queryValue = queries[i][0];
            int queryIndex = queries[i][1];
            int valueAfterQuery = nums[queryIndex] + queryValue;

            // Step5 - Check if odd or even
            if (valueAfterQuery % 2 == 0) {

                // Step6- Check to see index was once an even number
                // Remove it from the set
                if (indexSet.contains(queryIndex)) {
                    total -= nums[queryIndex];
                    indexSet.remove(queryIndex);
                }

                // Step7 - Update the total variable and add index to list of even set
                total += valueAfterQuery;
                indexSet.add(queryIndex);


            } else {        // This is the odd

                // Step6- Check to see index was once an even number
                // Remove it from the set
                if (indexSet.contains(queryIndex)) {
                    total -= nums[queryIndex];
                    indexSet.remove(queryIndex);
                }
            }
            System.out.println("i:" + i + "   total: " + total);

            // Step8 - Update the total & array
            output[i] = total;
            nums[queryIndex] = valueAfterQuery;
        }

        return output;
    }
}

/**
 Notes
 - Not difficult but tricky
 - My personal solution =)
 - Just follow the example

 Solution
 1. Use a set to store the even indexes
 2. Use a total variable to store the total
 3. Traverse the query array
 4. If the query updates an even number, then we increment total and add index to the set
        > Then we check if it once an even # and remove it if true
    > If the query update an odd number, we just check if it once an even # and remove it if true
 5. Update the total and add that to the output
 */