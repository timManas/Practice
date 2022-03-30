package Strings.LongPressedName;

public class LongPressedName {
    public static void main(String [] args) {
        String name = "alex";
        String typed = "aaleex";
        System.out.println("isLongPressed: " + isLongPressedName(name, typed) + "\n");

        String name1 = "saeed";
        String typed1 = "ssaaedd";
        System.out.println("isLongPressed: " + isLongPressedName(name1, typed1) + "\n");

        String name2 = "alex";
        String typed2 = "aaleexa";
        System.out.println("isLongPressed: " + isLongPressedName(name2, typed2) + "\n");

        String name3 = "alexd";
        String typed3 = "ale";
        System.out.println("isLongPressed: " + isLongPressedName(name3, typed3) + "\n");
    }

    public static boolean isLongPressedName(String name, String typed) {

        // Step1 - Create indexes;
        int n = 0;
        int t = 0;
        char prev = ' ';

        // Step2 - Traverse the name word character by character
        while (n < name.length()) {

            // Step3 - Check if index t stil exists
            if (t >= typed.length())
                return false;

            // Step4 - Find the characters
            char nLetter = name.charAt(n);
            char tLetter = typed.charAt(t);


            // Step5 - Check if the letters are equal
            if (tLetter == nLetter) {
                n++;
            } else if (tLetter == prev) {

            } else {
                return false;
            }

            // nLetter == prev
            prev = tLetter;
            t++;
        }

        // Step6 - If there are any left over letters from typed, they better be the same the prev
        while (t < typed.length()) {
            if (typed.charAt(t) != prev)
                return false;
            t++;
        }


        return true;
    }

}
