package Lists.MinRightShiftToSoryArray;

import java.util.ArrayList;
import java.util.List;

public class MinRightShiftToSoryArray {
    public static void main(String [] args) {
        int [][] input = {{3,4,5,1,2}, {1,3,5}, {2,1,4}};
        for (int [] arr : input) {
            List<Integer> list = new ArrayList<>();
            for (int i : arr) list.add(i);
            System.out.println("minShift: " + minimumRightShifts(list));
        }
    }

    public static int minimumRightShifts(List<Integer> nums) {
        int count = 0;



        return count;
    }
}
