package Misc.HammingDistance;

public class HammingDistance {

    public static void main (String [] args) {
//        int x = 1, y = 4;
        int x = 3, y = 1;

        System.out.println("Hamming Distance: " + hammingDistance(x, y));
    }

    public static int hammingDistance(int x, int y) {

        // Find the XOR value
        String xor = Integer.toBinaryString(x^y);
        System.out.println("XOR: " + xor);

        // Count # of 1's in the xor
        int count = 0;
        for (int i=0; i < xor.length(); i++)
            if (xor.charAt(i) == '1')
                count++;

        return count;
    }
}

/**
 Solution
 1. Find the XOR valuer of x & y using '^'
 2. Count the numbers of 1's
 */
