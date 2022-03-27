package Strings.NumberOfSegmentsString;

public class NumberOfSegmentsString {
    public static void main(String [] args) {
        String [] input = { "Hello, my name is John", "Hello", "",", , , ,        a, eaefa"};
        for (String i : input)
            System.out.println("Count Segment: " + countSegments(i));
    }

    public static int countSegments(String s) {

        if (s.trim().equals(""))
            return 0;

        String [] array = s.trim().split(" ");
        return array.length;
    }
}
