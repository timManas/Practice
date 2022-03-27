package Strings.NumberOfSegmentsString;

public class NumberOfSegmentsString {
    public static void main(String [] args) {
        String [] input = { "Hello, my name is John", "Hello", "",", , , ,        a, eaefa"};
        for (String i : input)
            System.out.println("Count Segment: " + countSegments(i));
    }

    public static int countSegments(String s) {
        // Step1 - Split s into non space character
        String [] array = s.trim().split(" ");

        // Step2 - Count # of non space characters
        int countNonBlank = 0;
        for (String i : array) countNonBlank = i.equalsIgnoreCase("") ? countNonBlank : countNonBlank + 1;

        return countNonBlank;
    }
}
