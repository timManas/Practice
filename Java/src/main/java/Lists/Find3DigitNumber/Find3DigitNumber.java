package Lists.Find3DigitNumber;

import java.lang.reflect.Array;
import java.util.*;

public class Find3DigitNumber {
    public static void main(String [] args) {
        int [][] input = {{2,1,3,0}, {2,2,8,8,2}, {3,7,5}};
        for (int[] i : input) {
            int [] output = findEvenNumbers(i);
            printArray(output);
        }
    }



    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new TreeSet<>();

        // Sort digits
        Arrays.sort(digits);
        printArray(digits);

        StringBuilder sb = new StringBuilder();
        int start = digits[0] == 0 ? 1 : 0;

        for (int i=start; i < digits.length; i++) {
            for (int j=0; j < digits.length; j++) {
                for (int k=0; k < digits.length; k++) {

                    if (digits[i] == digits[j] || digits[i] == digits[k] || digits[j] == digits[k])
                        continue;

                    int number = 100 * digits[i] + 10 * digits[j] + digits[k];
                    if (number % 2 == 0)
                        set.add(number);
                    System.out.println(number);
                }
            }
        }


        // Convert to array and return
        List<Integer> list = new ArrayList<>(set);
        int [] output = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            output[i] = list.get(i);
        }
        return output;
    }

    private static void printArray(int[] output) {
        System.out.println("\nPrint Array-----");
        for (int i : output)
            System.out.print(i + ",");
        System.out.println();
    }
}
