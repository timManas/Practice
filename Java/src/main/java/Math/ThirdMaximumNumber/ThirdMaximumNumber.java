package Math.ThirdMaximumNumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ThirdMaximumNumber {

    public static void main (String [] args) {
//        int [] nums = {3, 2, 1};
//        int [] nums = {2,2,3,1};
        int [] nums = {1,2};
        System.out.println("ThirdMax: " + thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {

        // Step 1 - Convert to TreeSet
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i : nums) {
            set.add(i);
        }

        // Step2 - Get thhird largest
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        if (set.size() < 3)
            return list.get(list.size() - 1);


        return list.get(list.size() - 3);
    }
}
