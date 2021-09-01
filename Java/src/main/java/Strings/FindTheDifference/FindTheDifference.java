package Strings.FindTheDifference;

public class FindTheDifference {
    public static void main(String [] args) {
        String s = "abcd", t = "abcde";
        System.out.println("Diff: " + findTheDifference(s,t));

        String s1 = "", t1 = "y";
        System.out.println("Diff: " + findTheDifference(s1,t1));

        String s2 = "a", t2 = "aa";
        System.out.println("Diff: " + findTheDifference(s2,t2));

        String s3 = "ae", t3 = "aea";
        System.out.println("Diff: " + findTheDifference(s3,t3));
    }

    public static char findTheDifference(String s, String t) {
        // Find the smaller vs larger String
        String smallStr = s.length() < t.length() ? s : t;
        String largeStr = s.length() < t.length() ? t : s;

        // Traverse through smaller string and replace the value in larger string
        for (int i=0; i < smallStr.length(); i++) {
            char letter = smallStr.charAt(i);
            largeStr = largeStr.replaceFirst(String.valueOf(letter), " ");
        }
        System.out.println("LargeLetter: " + largeStr);

        // Return the only character
        return largeStr.trim().charAt(0);
    }
}
