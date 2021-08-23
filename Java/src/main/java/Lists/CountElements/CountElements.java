package Lists.CountElements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountElements {
    public static void main(String [] args) {
        int [][] input = {{1,2,3}, {1,1,3,3,5,5,7,7}, {1,3,2,3,5,0}, {1,1,2,2},{1,1,2}};
        for (int [] i : input)
            System.out.println("Count Elements: " + countElements(i));
    }

    public static int countElements(int[] arr) {
        int count = 0;

        // Step1 - Convert to list
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        // Step2 - Sort the list
        Collections.sort(list);

        // Step3 - Check if x+1 is in list
        for (int i : arr) {
            count = list.contains(i+1) ? count + 1 : count;
        }

        return count;
    }
}
