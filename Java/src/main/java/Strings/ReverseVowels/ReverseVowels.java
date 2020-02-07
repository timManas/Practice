package Strings.ReverseVowels;

public class ReverseVowels {

    public static void main(String [] args) {
//        String input = "leetcode";
        String input = "aA";
        System.out.println("Reversed: " + reverseVowels(input));
    }

    public static String reverseVowels(String input) {
        String vowels = "aeiouAEIOU";

        StringBuilder sb = new StringBuilder(input);
        int frontIndex = 0;
        int endIndex = input.length() - 1;

        while (frontIndex <= endIndex) {
            char frontLetter = sb.charAt(frontIndex);
            char endLetter = sb.charAt(endIndex);
            System.out.println("Front: " + frontLetter + "      End: " + endLetter);

            if (vowels.indexOf(frontLetter) == -1 && vowels.indexOf(endLetter) == -1) {
                ++frontIndex;
                --endIndex;
            } else if (vowels.indexOf(frontLetter) >= 0 && vowels.indexOf(endLetter) == -1) {
                --endIndex;
            } else if (vowels.indexOf(frontLetter) == -1 && vowels.indexOf(endLetter) >= 0) {
                ++frontIndex;
            } else {
                char temp = frontLetter;
                frontLetter = endLetter;
                endLetter = temp;
                sb.replace(frontIndex, frontIndex + 1, String.valueOf(frontLetter));
                sb.replace(endIndex, endIndex + 1, String.valueOf(endLetter));
                ++frontIndex;
                --endIndex;
            }

        }
        return sb.toString();
    }

}

enum Vowels {
    a,A,
    e,E,
    i,I,
    o,O,
    u,U
}
