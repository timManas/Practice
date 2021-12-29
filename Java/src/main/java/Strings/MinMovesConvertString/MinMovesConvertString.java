package Strings.MinMovesConvertString;

public class MinMovesConvertString {
    public static void main(String [] args) {
        String [] input = {"XXXOOXXX","XXOX", "OOOO", "OXOX","1234567890", "XXX"};
        for (String i : input)
            System.out.println("Min Moves: " + minimumMoves(i) + "\n");


    }

    public static int minimumMoves(String s) {
        // Step1 - Create output variable
        int min = 0;
        int start=0;

        // Step2 - Traverse the String
        while ( start < s.length()) {

            // Step3 - Create SubString
            int end = s.length() < start+3 ? s.length() : start+3;
            String subString = s.substring(start, end);
            System.out.println("SubString:" + subString);

            // Step4 - Check if SubString contains X. If so, set start at the first X position
            if (subString.contains("X")) {
                start += subString.indexOf("X");
                end = s.length() < start + 3 ? s.length() : start + 3;

                subString = s.substring(start, end);
                System.out.println("Moved SubString:" + subString);
                ++min;
            }
            // Step5 - Update start to move by 3
            start += 3;
        }

        return min;
    }
}
