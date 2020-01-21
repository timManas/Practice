package Lists.FindAllNumbersMissingInArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersMissingInArray {

    public static void main(String [] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = (ArrayList<Integer>) findDisappearedNumbers(nums);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if (nums.length == 0)
            return list;

        for (int i=0; i < nums.length; i++) {


        }

        return list;
    }
}
