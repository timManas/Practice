package Strings.RemoveVowelsFromStrings;

public class RemoveVowelsFromStrings {

    public static void main(String [] args) {
        String input = "leetcodeisacommunityforcoders";

        System.out.println("RemoveVowes: " + removeVowels(input));
    }

    public static String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < S.length(); i++) {
            char letter = S.charAt(i);
            if (letter == 'a' ||
                    letter == 'i' ||
                    letter == 'e' ||
                    letter == 'o' ||
                    letter == 'u') {
                continue;
            }

            sb.append(letter);
        }
        return sb.toString();
    }
}
