package Strings.LongPressedName;

public class LongPressedName {
    public static void main(String [] args) {
        String name = "alex";
        String typed = "aaleex";
        System.out.println("isLongPressed: " + isLongPressedName(name, typed) + "\n");

        String name1 = "saeed";
        String typed1 = "ssaaedd";
        System.out.println("isLongPressed: " + isLongPressedName(name1, typed1) + "\n");
    }

    public static boolean isLongPressedName(String name, String typed) {

        int n = 0;
        int t = 0;

        char prev = ' ';
        while (n < name.length()) {
            char nLetter = name.charAt(n);
            char tLetter = typed.charAt(t);

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

        return true;
    }
}
