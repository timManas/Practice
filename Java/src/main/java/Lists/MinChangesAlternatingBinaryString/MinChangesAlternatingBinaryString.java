package Lists.MinChangesAlternatingBinaryString;

public class MinChangesAlternatingBinaryString {
    public static void main(String [] args) {
        String [] input = {"1111","10010100"};
        for (String i : input)
            System.out.println("Min Operations: " + minOperations(i));

    }

    public static int minOperations(String string) {
        StringBuilder sb = new StringBuilder(string);
        int min1 = 0;
        int min2 = 0;

        // Alternate from Left to Right
        for (int i=1; i<sb.length();i++) {
            char prev = sb.charAt(i-1);
            char current = sb.charAt(i);

            if (prev == current) {
                min1++;
                sb.setCharAt(i, current == '0' ? '1' : '0');
            }
        }
        System.out.println("LR: " + sb.toString());

        // Alternate at Right to Left
        sb = new StringBuilder(string);
        for (int i=sb.length()-2; i >= 0; i--) {
            char next = sb.charAt(i+1);
            char current = sb.charAt(i);

            if (next == current) {
                min2++;
                sb.setCharAt(i, current == '0' ? '1' : '0');
            }
        }

        System.out.println("RL: " + sb.toString());


        return Math.min(min1, min2);
    }
}
