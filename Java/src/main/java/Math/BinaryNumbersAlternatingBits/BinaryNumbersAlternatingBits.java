package Math.BinaryNumbersAlternatingBits;

public class BinaryNumbersAlternatingBits {
    public static void main(String [] args) {
        int [] input = {5,7,11,10,3};
        for (int i : input)
            System.out.println("Has Alternating Bits: " + hasAlternatingBits(i));
    }

    public static boolean hasAlternatingBits(int n) {

        String bits = Integer.toBinaryString(n);
        for (int i=1; i < bits.length();i++)  {
            if (bits.charAt(i-1) == bits.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
