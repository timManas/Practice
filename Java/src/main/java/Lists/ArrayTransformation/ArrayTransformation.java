package Lists.ArrayTransformation;

import java.util.ArrayList;
import java.util.List;

public class ArrayTransformation {
    public static void main(String [] args) {
        int [][] input = {{6,2,3,4},{1,6,3,4,3,5}};
        for (int [] i: input) {
            System.out.println("Transform Array: " + transformArray(i) +  "\n");
        }
    }

    public static List<Integer> transformArray(int[] arr) {

        // Step1 - Create output list and convert it to a list
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        // Step2 - Continue Transforming array.
        // Stop when there are no elements transformed
        boolean isTransformed = true;
        while (isTransformed) {
            isTransformed = false;
            List<Integer> tempList = new ArrayList<>(list);

            // Step3 - Create tempArray and Transform each element
            for (int i=0; i<list.size(); i++) {
                if (i== 0 || i == list.size() -1) {
                    continue;
                }

                // Keep a reference of prev, current, next
                int prev = list.get(i-1);
                int current = list.get(i);
                int next = list.get(i+1);
                System.out.println("prev: "+ prev + "       current: " + current + "     next: " + next);

                // Step4 - Increment or decrement each element in the tempList
                if (prev > current && current < next) {
                    tempList.set(i, current + 1);
                    isTransformed = true;
                } else if (prev < current && current > next) {
                    tempList.set(i, current - 1);
                    isTransformed = true;
                }
            }


            System.out.println("list: " + list + "      " + "templist: " + tempList);

            list = tempList;    // Update the list to become the nextday list
        }

        return list;
    }
}
