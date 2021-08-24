package Lists.MinChangesAlternatingBinaryString;

public class MinChangesAlternatingBinaryString {
    public static void main(String [] args) {
        String [] input = {"0100", "10", "1111"};
        for (String i : input)
            System.out.println("Min Operations: " + minOperations(i));

    }

    public static int minOperations(String string) {
        int min1 = 0;
        int min2 = 0;

        // Alternate from Left to Right
        for (int i=1; i<string.length();i++) {
            char prev = string.charAt(i-1);
            char current = string.charAt(i);



        }

        // Alternate at Right to Left
        for (int i=0; i < string.length(); i++) {

        }


        return Math.min(min1, min2);
    }
}
