package Strings.ImplementStrStr;

public class ImplementStrstr {

    public static void main(String [] args) {

        String haystack = "hello";
        String needle = "ll";

        System.out.println("FirstOccurrence: " + strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        int index = -1;

        // If needle is blank we return -1
        if (needle.equals(""))
            return 0;

        index = haystack.indexOf(needle);



        return index;
    }

}
