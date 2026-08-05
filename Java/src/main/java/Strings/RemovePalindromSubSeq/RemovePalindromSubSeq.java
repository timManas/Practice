package Strings.RemovePalindromSubSeq;

public class RemovePalindromSubSeq {

    public static void main(String [] args) {
        String [] input = {"ababa", "abb", "baabb", "bbaabaaa"};
        for (String string : input) {
            System.out.println("NumSubSeq: " + removePalindromeSub(string) + "\n");
        }
    }

    public static int removePalindromeSub(String input) {
        System.out.println("input: " + input);
        int count = 0;

        StringBuilder original = new StringBuilder(input);
        String reversed = original.reverse().toString();

        if (input.equalsIgnoreCase(reversed))
            return 1;




        return 2;
    }
}

/*
abb
bba

bbaabaaa
aaabaabb
 */