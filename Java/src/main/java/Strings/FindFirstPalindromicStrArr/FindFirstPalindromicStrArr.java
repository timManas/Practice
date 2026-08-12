package Strings.FindFirstPalindromicStrArr;

public class FindFirstPalindromicStrArr {

    public static void main(String [] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
        System.out.println("FirstPalindrome: " + firstPalindrome(words) + "\n");

        String [] words1 = {"notapalindrome","racecar"};
        System.out.println("FirstPalindrome: " + firstPalindrome(words1) + "\n");

        String [] words2 = {"def","ghi"};
        System.out.println("FirstPalindrome: " + firstPalindrome(words2) + "\n");


    }

    public static String firstPalindrome(String[] words) {
        String word = "";

        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            sb = new StringBuilder(str);

            if (str.equalsIgnoreCase(sb.reverse().toString()))
                return str;
        }

        return word;
    }
}
