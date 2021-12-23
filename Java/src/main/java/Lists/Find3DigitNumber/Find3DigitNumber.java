package Lists.Find3DigitNumber;

import java.lang.reflect.Array;
import java.util.*;

public class Find3DigitNumber {
    public static void main(String [] args) {
        int [][] input = {{0,2,0,0}, {2,1,3,0}, {2,2,8,8,2}, {3,7,5} };
        for (int[] i : input) {
            int [] output = findEvenNumbers(i);
            printArray(output);
        }
    }



    public static int[] findEvenNumbers(int[] digits) {
        // Step1 - Create set to store unique numbers
        Set<Integer> set = new TreeSet<>();

        // Step2 - Sort digits array
        Arrays.sort(digits);
        printArray(digits);

        // Step3 - Traverse Digits array
        int start = digits[0] == 0 ? 1 : 0;
        for (int i=start; i < digits.length; i++) {
            for (int j=0; j < digits.length; j++) {
                for (int k=0; k < digits.length; k++) {

                    // Make sure the indexes are NOT the same ...
                    if (i == j || i == k || j == k)
                        continue;

                    // Find the number created
                    int number = 100 * digits[i] + 10 * digits[j] + digits[k];

                    // Check if the number is 3 digits
                    if (99 > number || number > 999)
                        continue;

                    // Add to set
                    if (number % 2 == 0)
                        set.add(number);
                    System.out.println(number);
                }
            }
        }


        // Step4 - Convert to array and return
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
