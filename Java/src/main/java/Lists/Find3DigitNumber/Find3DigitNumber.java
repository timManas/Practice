package Lists.Find3DigitNumber;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find3DigitNumber {
    public static void main(String [] args) {
        int [][] input = {{2,1,3,0}, {2,2,8,8,2}, {3,7,5}};
        for (int[] i : input) {
            int [] output = findEvenNumbers(i);
            printArray(output);
        }
    }



    public static int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();

        // Sort digits
        Arrays.sort(digits);
        printArray(digits);


        // Convert to array and return
        int [] output = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            output[i] = list.get(i);
        }
        return output;
    }

    private static void printArray(int[] output) {
        System.out.println("\nPrint rArray-----");
        for (int i : output)
            System.out.print(i + ",");
    }
}
