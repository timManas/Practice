package Misc.ConstructRectangle;

public class ConstructRectangle {
    public static void main(String [] args) {
        int [] input = {4, 37, 122122};
        for (int i : input) {
            int[] output = constructRectangle(i);
            System.out.println("Returned length: " + output[0] + "   width: " + output[1] + "\n");
        }
    }

    // Use BruteForce
    public static int[] constructRectangle(int area) {
        // Step1 - Create output array
        int [] output = new int[2];
        output[0] = area;
        output[1] = 1;

        // Step2 - Check if sqrt is full # (i.e Difference is zero)
        if (Math.sqrt(area) % 1 == 0) {
            output[0] = (int) Math.sqrt(area);
            output[1] = (int) Math.sqrt(area);
            return output;
        }

        // Step3 - Traverse from area to 1. Find the modulus to check if full #
        int minDiff = Integer.MAX_VALUE;
        int length = area;
        int width = 0;
        while (length >= 1) {

            // Step4 - Stop array if width is bigger ...since it breaks the conditions of the problem
            if (length < width )
                break;

            int remainder = area % length;
            if (remainder == 0) {
                width = area / length;

                if (minDiff > Math.abs(length - width)) {   // Update the output array if minDiff is bigger
                    minDiff = length - width;
                    output[0] = length;
                    output[1] = width;
                    System.out.println("length: " + length + "  width: " + width);
                }
            }

            --length;   // Decrement length
        }

        return output;
    }
}
