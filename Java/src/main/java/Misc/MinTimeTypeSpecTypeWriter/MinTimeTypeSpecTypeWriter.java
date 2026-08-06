package Misc.MinTimeTypeSpecTypeWriter;

public class MinTimeTypeSpecTypeWriter {
    public static void main (String [] args) {
        String [] input = {"abc", "bza", "zjpc", "pdy", "b"};
        for (String i : input)
            System.out.println("MinTime: " + minTimeToType(i) + "\n");
    }

    public static int minTimeToType(String word) {
        System.out.println("word: " + word);

        if (word.length() <= 1) {
            if (word.equalsIgnoreCase("a")) {
                return 1;
            }
            return 2;
        }

        int count = 0;

        if (word.charAt(0) != 'a') {
            count += getMinTime(word, 0, true);
        }

        for (int i=0; i<word.length()-1; i++) {
            ++count;
            count += getMinTime(word, i, false);
        }

        ++count;



        return count;
    }

    public static int getMinTime(String word, int i, boolean start) {

        char current = word.charAt(i);
        char next = word.charAt(i+1);

        if (start) {
            current = 'a';
            next = word.charAt(0);
        }

        int cNum = (int) current - 96;
        int nNum = (int) next - 96;

        System.out.println("current: " + current + "[" + cNum + "]"  + "     next: " + next + "[" + nNum + "]" );

        int forwardDistance = nNum - cNum;
        if (forwardDistance < 0) {
            forwardDistance = 26 - Math.abs( forwardDistance);
        }

        int reverseDistance = 26 - nNum + cNum;
        if (reverseDistance > 26) {
            reverseDistance = Math.abs( 26 - reverseDistance);
        }

        System.out.println("        forwardDistance: " + forwardDistance  + "      reverseDistance: " + reverseDistance);

        return Math.min(forwardDistance, reverseDistance);
    }
}
