package Strings.MinMovesConvertString;

public class MinMovesConvertString {
    public static void main(String [] args) {
        String [] input = {"XXOX", "OOOO", "OXOX","1234567890", "XXX"};
        for (String i : input)
            System.out.println("Min Moves: " + minimumMoves(i) + "\n");


    }

    public static int minimumMoves(String s) {
        int minForward = 0;
        for (int i=0; i < s.length(); i+=3) {
            int end = s.length() < i+3 ? s.length() : i+3;
            String subString = s.substring(i, end);
            System.out.println("Forward SubString:" + subString);

            if (subString.contains("X"))
                ++minForward;
        }

        int minBackward = 0;
        for (int i=s.length(); i>0; i-=3) {
            int start = 0 > i-3 ? 0 : i-3;
            String subString = s.substring(start, i);
            System.out.println("Backward SubString:" + subString);

            if (subString.contains("X"))
                ++minBackward;
        }

        return Math.min(minForward, minBackward);
    }
}
