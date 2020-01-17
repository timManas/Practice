package Strings.ImplementStrStr;

public class ImplementStrstr {

    public static void main(String [] args) {

        String haystack = "mississippi";

        String needle = "issip";

        System.out.println("FirstOccurrence: " + strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        int index = -1;

        // If needle is blank we return -1
        if (needle.equals(""))
            return 0;


        // Solution #1 - Using Java built in method
        System.out.println("Easy Solution: " + useBuiltInMethods(haystack, needle));

        // Solution #2 - Using old fashion way
        index = useSoln2(haystack, needle);

        return index;
    }

    private static int useSoln2(String haystack, String needle) {

        // TODO :: UNFINISHED ...USE KMP Solution on Youtube


        return 0;
    }

    private static int useBuiltInMethods(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
