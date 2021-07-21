package Math.BinaryGap;

public class BinaryGap {
    public static void main(String [] args) {
        int [] input = {22, 5, 6, 8,1, 13 };
        for (int i : input)
            System.out.println("Binary Gap: " + binaryGap(i));
    }

    public static int binaryGap(int n) {
        int highestGap = 0;

        // Step1 - Convert n to boolean
        String bool = Integer.toBinaryString(n);
        System.out.println("boolean: " + bool + "   n: " + n);

        // Step2 - Traverse boolean character by character
        boolean isFound = false;
        int gap = 0;
        for (int i=0; i < bool.length(); i++) {
            char number = bool.charAt(i);

            // Step3 - Check if Found
            if (isFound) {
                ++gap;              // Regardless what #, we increment

                // Step4 - If found and equal one, we reset gap again
                // Check for new value of highestGap
                if (number == '1') {
                    highestGap = highestGap < gap ? gap : highestGap;
                    gap = 0;
                }

            } else {

                // Step4b - If just newly found, we start counter
                if (number == '1') {
                    isFound = true;
                    gap = 0;
                }
            }
        }

        return highestGap;
    }
}
