package Strings.DeleteCharFancyString;

public class DeleteCharFancyString {
    public static void main(String [] args) {
        String [] input = {"abcdefghi","leeetcode", "aaabaaaa", "aab", "s"};
        for (String i : input)
            System.out.println("Fancy String: " + makeFancyString(i) + "\n");
    }

    public static String makeFancyString(String s) {

        if (s.length() <= 2) return s;

        // Add first two letters
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));

        // Step2 - Start from third letter to last
        for (int i=2; i<s.length();i++) {
            char letter = s.charAt(i);
            char prev1 = sb.charAt(sb.length() - 1);
            char prev2 = sb.charAt(sb.length() - 2 );

            System.out.println("letter: " + letter + "      prev1: " + prev1 + "    prev2: " + prev2 );

            // Step3-  Compare last two letters from sb with current letter
            if (prev1 == prev2 && prev1 == letter) {
                continue;
            }

            sb.append(letter);
        }

        return sb.toString();
    }
}
