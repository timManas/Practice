package Lists.ContainsDuplicatesII;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ContainDuplicatesII {

    public static void main(String [] args) {

//        int [] nums = {1,2,3,1};
//        int k = 3;

//        int [] nums = {1,2,3,1,2,3};
//        int k = 2;

        int [] nums = {-1,-1};
        int k = 1;



        System.out.println("ContainsDuplicates: " + containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Use a HashSet to keep track of the K values

        // Step 1 - Create a place to store values in with size k at most
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        // Step2 - Traverse nums
        for (int i=0; i < nums.length; i++) {

            int currentVal = nums[i];

            // Step2b - If current value already in set, return true
            if (set.contains(currentVal))
                return true;

            // Step3 - Add to set
            set.add(currentVal);

            // Step4 - Remove the last i-k value
            if (set.size() > k)
                set.remove(nums[i-k]);


        }

        return false;
    }

}

/**
 solution
 - Use a "moving window" to find the solution
 - Set will keep track of list



 */
