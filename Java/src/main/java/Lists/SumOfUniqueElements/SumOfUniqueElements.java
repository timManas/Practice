package Lists.SumOfUniqueElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SumOfUniqueElements {
    public static void main (String [] args) {
        int [][] input = {{1,2,3,2}, {1,1,1,1,1}, {1,2,3,4,5}};
        for (int [] nums : input)
            System.out.println("Sum Of Unique: " + sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Set<Integer> set = new TreeSet<>();
        Set<Integer> uniqueSet = new TreeSet<>();

        //  Traverse input array & Populate Set
        for (int i : nums) {

            // If number is not unique, remove number from unique set
            if (set.contains(i)) {
                uniqueSet.remove(i);
                continue;
            }

            // Add number to set and unique Set
            set.add(i);
            uniqueSet.add(i);
        }

        // Convert Set to list and Calculate sum
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        for (int i : uniqueList)
            sum += i;

        return sum;
    }
}
