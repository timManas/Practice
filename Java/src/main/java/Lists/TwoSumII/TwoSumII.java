package Lists.TwoSumII;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TwoSumII {
    public static void main(String [] args) {
        int [] numbers = {2,7,11,15};
        int target = 9;
        int [] output = twoSum(numbers, target);
        System.out.println("Two Sum: " + output[0] + "  " + output[1]);

        int [] numbers2 = {-1, 0};
        int target2 = -1;
        int [] output2 = twoSum(numbers2, target2);
        System.out.println("Two Sum: " + output2[0] + "  " + output2[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {

        // Step1 - Create output array
        int [] output = new int[2];

        // Step2 - Create set to store unique numbers
        // Create list to store the index
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        // Step3 - Traverse the array
        for (int i=0; i < numbers.length; i++) {
            int num = numbers[i];
            int diff = target - num;

            // Setp4 - Check if the diff is in the set. Add it to output list beginning with smaller index first
            if (set.contains(diff)) {
                if (num < diff) {
                    output[0] = i + 1;
                    output[1] = list.indexOf(diff) + 1;
                } else {
                    output[0] = list.indexOf(diff) + 1;
                    output[1] = i + 1;
                }
                break;
            }

            // Step5 - Add element to set and list
            set.add(num);
            list.add(num);
        }


        return output;
    }
}
