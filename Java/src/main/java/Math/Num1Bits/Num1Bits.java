package Math.Num1Bits;

public class Num1Bits {
    public static void main(String [] args) {
        int [] input = {11, -3};
        for (int i : input)
            System.out.println("Hamming Weight: " + hammingWeight(i));

    }

    public static int hammingWeight(int n) {

        // Step1 - Convert to binary
        String unsignedN = Integer.toBinaryString(n);

        // Step2 - Count num of 1s
        int count = 0;
        for (int i=0; i < unsignedN.length(); i++) {
            if (unsignedN.charAt(i) == '1')
                ++count;
        }

        return count;
    }
}
