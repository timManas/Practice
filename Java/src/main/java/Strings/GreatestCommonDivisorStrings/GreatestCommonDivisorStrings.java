package Strings.GreatestCommonDivisorStrings;

public class GreatestCommonDivisorStrings {
    public static void main(String [] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println("GCD Strings: " + gcdOfStrings(str1, str2));

        String str3 = "ABABAB";
        String str4 = "ABAB";
        System.out.println("GCD Strings: " + gcdOfStrings(str3, str4));

        String str5 = "LEET";
        String str6 = "CODE";
        System.out.println("GCD Strings: " + gcdOfStrings(str5, str6));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String gcd = "";
        String longStr = str1.length() < str2.length() ? str2 : str1;
        String shortStr = str1.length() <= str2.length() ? str1 : str2;

        int divider = 1;
        while (divider < longStr.length()) {
            String subStr = longStr.substring(0, divider + 1);
            System.out.println("\nSubString: " + subStr);
            String[] split = longStr.split(subStr, -1);
            System.out.println("#Occurences: " + (split.length - 1));
            for (String i : split) System.out.print(i + ",");


            ++divider;
        }

        return gcd;
    }
}
