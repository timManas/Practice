package Strings.ToLowerCase;

public class ToLowerCase {

    public static void main(String [] args) {
        String input = "Hello";
        System.out.println("LowerCase: " + toLowerCase(input));
    }

    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < str.length();i++) {
            char letter = str.charAt(i);

            if (letter >= 65 && letter <= 90) {
                letter = (char) (letter + 32);      // We add 32 because it is 32 chars to uppercase =)

            }
            sb.append(letter);

        }


        return sb.toString();
    }
}
