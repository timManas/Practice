package Strings.MinimumChangeMakeAlternatingBinaryStr;

public class MinimumChangeMakeAlternatingBinaryStr {
    public static void main (String [] args) {
        String [] input = {"0100", "10", "1111", "10010100" };
        for (String i : input)
            System.out.println("Min Operations: " + minOperations(i) + " \n");

    }

    public static int minOperations(String s) {
        int zero = traverseStr(s, '0');
        System.out.println();
        int one = traverseStr(s, '1');
        return Math.min(zero, one);
    }

    private static int traverseStr(String s, char last) {
        int min = 0;

        if (s.charAt(0) != last) {
            min++;
        }

        for (int i=1; i < s.length(); i++) {
            char current = s.charAt(i);
            System.out.println("current: " + current );

            if (current != last) {
                last = current;
                continue;
            }

            min++;
            last = current == '0' ? '1' : '0';
        }

        return min;
    }
}
