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

        String str11 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str12 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println("GCD Strings: " + gcdOfStrings(str11, str12) + "\n");
    }

    public static String gcdOfStrings(String str1, String str2) {
        String gcd = "";

        // Step1 - Find ShortString First
        String longStr = str1.length() <= str2.length() ? str2 : str1;
        String shortStr = str1.length() <= str2.length() ? str1 : str2;

        // Step2 - Traverse from Length to 0 of the ShortStr. Why ? We use the shortStr to check if it appears in the long str and divides evenly
        for (int i=shortStr.length() - 1;  i >= 0; i--) {
            // Step3 - Find the substring from shortStr
            String subStr = shortStr.substring(0, i + 1);
            String[] splitSubStr = shortStr.split(subStr, -1);

            // Step4 - Check if SubString appears evenly in ShortString (i.e divides evenly with no remainders)
            boolean isBlank = true;
            for (String s : splitSubStr) {
                if (!s.equalsIgnoreCase("")) {
                    isBlank = false;
                    break;
                }
            }

            // Step5 - Check if subStr also appears evenly in LongString
            if (isBlank && longStr.indexOf(subStr) != -1) {
                System.out.println("SubString Found: " + subStr);

                String [] splitLongStr = longStr.split(subStr, -1);
                for (String str : splitLongStr) {
                    if (!str.equalsIgnoreCase("")) {
                        isBlank = false;
                        break;
                    }
                }

                // This returns the biggest first
                if (isBlank)
                    return subStr;
            }

        }

        return gcd;
    }
}
