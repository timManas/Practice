package Lists.SortByParityII;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByParityII {
    public static void main(String [] args) {
        int [] A = {4,2,5,7};
        int [] result = sortArrayByParityII(A);
        for (int i : result)
            System.out.println(i);
    }

    public static int[] sortArrayByParityII(int[] A) {

        // Step1 - Create list
        int [] result = new int[A.length];

        // Step2 - Create oddList and evenList to store odd and even values
        List<Integer> oddList = new ArrayList<Integer>();
        List<Integer> evenList = new ArrayList<Integer>();

        // Step2b - Initialize both list by traversing A and populating odd and evenList
        for (int i : A) {
            if (i % 2 == 0)
                evenList.add(i);
            else
                oddList.add(i);
        }

        // Step3 - Sort just for kicks
        Collections.sort(oddList);
        Collections.sort(evenList);

        // Step4 - Traverse the result and keep track of index, oddIndex, evenIndex
        int index = 0;
        int oddIndex = 0;
        int evenIndex = 0;
        while(index < result.length) {

            // Step5 - Update respective index one by one after after fetching value from odd or even
            if (index % 2 == 0) {
                result[index] = evenList.get(evenIndex++);
            } else {
                result[index] = oddList.get(oddIndex++);
            }
            ++index;

        }

        return result;  // return result
    }
}
