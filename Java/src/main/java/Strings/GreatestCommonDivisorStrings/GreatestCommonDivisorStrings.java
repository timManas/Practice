package Strings.GreatestCommonDivisorStrings;

public class GreatestCommonDivisorStrings {
    public static void main(String [] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println("GCD Strings: " + gcdOfStrings(str1, str2) + "\n");

        String str3 = "ABABAB";
        String str4 = "ABAB";
        System.out.println("GCD Strings: " + gcdOfStrings(str3, str4) + "\n");

        String str5 = "LEET";
        String str6 = "CODE";
        System.out.println("GCD Strings: " + gcdOfStrings(str5, str6) + "\n");

        String str7 = "AA";
        String str8 = "A";
        System.out.println("GCD Strings: " + gcdOfStrings(str7, str8) + "\n");

        String str9 = "ABABABAB";
        String str10 = "ABAB";
        System.out.println("GCD Strings: " + gcdOfStrings(str9, str10) + "\n");
    }

    public static String gcdOfStrings(String str1, String str2) {
        String gcd = "";
        String longStr = str1.length() <= str2.length() ? str2 : str1;
        String shortStr = str1.length() <= str2.length() ? str1 : str2;

        int divider = longStr.length() - 1;
        while (divider >= 0 ) {
            String subStr = longStr.substring(0, divider + 1);

            String[] split = longStr.split(subStr, -1);
            System.out.println("#Occurences: " + (split.length - 1));

            // Check if every element in Split is empty (i.e divides evenly with no remainders)
            boolean isBlank = true;
            innerLoop:
            for (String s : split) {
                if (!s.equalsIgnoreCase("")) {
                    isBlank = false;
                    break innerLoop;
                }
                isBlank = true;
            }

            if (isBlank && shortStr.indexOf(subStr) != -1) {
                System.out.println("SubString Found: " + subStr);

                String [] splitShort = shortStr.split(subStr, -1);
                for (String str : splitShort) {
                    if (!str.equalsIgnoreCase("")) {
                        return "";
                    }
                }

                return subStr;
            }
            --divider;
        }

        return gcd;
    }
}
