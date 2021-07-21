package Math.ComplementBase10Int;

public class ComplementBase10Int {
    public static void main(String [] args) {
        int [] input = {5,7,10};
        for (int i : input)
            System.out.println("BitWiseComplement: " + bitwiseComplement(i) + "\n");
    }

    public static int bitwiseComplement(int n) {

        // Step1 - Convert n to binary
        String binaryN = Integer.toBinaryString(n);
        System.out.println("binary: " + binaryN);

        // Step2 - Take the complement
        StringBuilder complement = new StringBuilder(binaryN);
        for (int i=0; i < complement.length(); i++) {
            char letter = binaryN.charAt(i);

            if (letter == '0') {
                complement.replace(i, i+1, "1");
            } else if (letter == '1') {
                complement.replace(i, i+1, "0");
            }
        }

        // Step3 - Convert binary to number again
        return Integer.parseInt(complement.toString(), 2);
    }
}
