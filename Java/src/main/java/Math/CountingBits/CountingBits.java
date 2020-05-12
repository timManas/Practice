package Math.CountingBits;

public class CountingBits {

    public static void main(String [] args) {
        int input = 5;
        int [] bits = countBits(input);
        for (int i : bits)
            System.out.println(i);
    }

    public static int[] countBits(int num) {

        // Step1 - Create return variable
        int[] result = new int[num + 1];

        // Step2 - Traverse from 0 to num
        for (int i=0; i <= num; i++) {
            int num1s = 0;

            // Step3 - Fetch Binary representation
            String test = Integer.toBinaryString(i);

            // Step4 - Fetch Number of 1s
            test = test.replace("0","");
            num1s = test.length();

            // step5 - Add to result Array
            result[i] = num1s;
        }

        return result;
    }

}

/**
 Notes:
 1. Medium question but fairly trivial

 Solution
 1. Traverse from 0 - num
 2. Convert current i into binary
 3. Fetch all 1s by deleting all 0's
 4. Count # of 1s
 5. Add # of 1s to array
 6. Return array

 */
