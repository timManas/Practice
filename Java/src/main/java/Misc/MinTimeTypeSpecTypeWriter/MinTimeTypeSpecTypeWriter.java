package Misc.MinTimeTypeSpecTypeWriter;

public class MinTimeTypeSpecTypeWriter {
    public static void main (String [] args) {
        String [] input = {"abc", "bza", "zjpc"};
        for (String i : input)
            System.out.println("MinTime: " + minTimeToType(i) + "\n");
    }

    public static int minTimeToType(String word) {
        int count = 0;

        for (int i=0; i<word.length()-1; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i+1);
            int cNum = (int) current - 96;
            int nNum = (int) next - 96;

            System.out.println("current: " + current + "[" + cNum + "]"  + "     next: " + next + "[" + nNum + "]" );

            int forwardDistance = nNum - cNum;
            int reverseDistance = 26 - nNum + cNum;
            System.out.println("        forwardDistance: " + forwardDistance  + "      reverseDistance: " + reverseDistance);



        }

        return count;
    }
}
