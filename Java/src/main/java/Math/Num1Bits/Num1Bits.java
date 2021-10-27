package Math.Num1Bits;

public class Num1Bits {
    public static void main(String [] args) {
        String [] input = {"00000000000000000000000000001011", "00000000000000000000000010000000"};
        for (String i : input)
            System.out.println("Hamming Weight: " + hammingWeight(i));

    }

    public static int hammingWeight(int n) {

        String unsignedN = String.valueOf(n);
        int count = 0;
        for (int i=0; i < unsignedN.length(); i++) {
            if (unsignedN.charAt(i) == '1')
                ++count;
        }

        return count;
    }
}
