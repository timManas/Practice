package Trees.BinarySearch;

import java.util.Set;
import java.util.TreeSet;

public class BinarySearch {

    public static void main(String [] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println("SearchIndex: " + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int index = -1;
        
        // Step1 - Create Set to keep track of all values visited
        Set<Integer> set = new TreeSet<Integer>();

        // Step2 - Keep track of the start, end and middle Element
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int middleIndex;

        // Step3 - Traverse the nums array
        while (startIndex <= endIndex) {

            // Step4 - Find the middle value
            middleIndex = (endIndex + startIndex) / 2;
            int middle = nums[middleIndex];

            // Step5 - Break if WE DID NOT Find the element
            if (set.contains(middle))
                break;

            // Step6 - Update  the index properly
            if (middle == target) {
                return middleIndex;
            } else if (target < middle) {       // Left Side
                endIndex = middleIndex - 1;
            } else if (target > middle) {       // Right Side
                startIndex = middleIndex + 1;
            }

            // Step7 - Add middle Element to the set
            set.add(middle);

        }


        return index;
    }

}
