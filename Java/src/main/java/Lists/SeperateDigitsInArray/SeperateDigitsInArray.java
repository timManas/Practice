package Lists.SeperateDigitsInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeperateDigitsInArray {
    public static void main(String [] args) {
        int [][] input = {{13,25,83,77}, {7,1,3,9}};
        for (int [] i : input)
            System.out.println(Arrays.toString(separateDigits(i)) + "\n");
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            String numStr = String.valueOf(num);
            String [] numStrArr = numStr.split("");

            for (int i=0; i<numStrArr.length; i++) {
                list.add(Integer.valueOf(numStrArr[i]));
            }
        }

        int [] output = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            output[i] = list.get(i);
        }


        return output;
    }
}
