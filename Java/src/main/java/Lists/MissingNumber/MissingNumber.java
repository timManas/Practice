package Lists.MissingNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

    public static void main(String []args) {

//        int [] nums = {9,6,4,2,3,5,7,0,1};
        int [] nums = {1};
        System.out.println("Missing Number: " + missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {



        // Initialize the Set
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0; i <= nums.length; i++) {
            set.add(i);
        }

        for (int i=0; i < nums.length; i++) {
            set.remove(nums[i]);
        }

        List<Integer> list = new ArrayList<Integer>(set);
        return list.get(0);

    }

}
